package net.zgysrc.www.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.zgysrc.www.bean.BookComment;
import net.zgysrc.www.bean.BookCommentExample;
import net.zgysrc.www.bean.BookInfo;
import net.zgysrc.www.bean.BookInfoExample;
import net.zgysrc.www.bean.BookInfoExample.Criteria;
import net.zgysrc.www.bean.BookList;
import net.zgysrc.www.bean.BookListExample;
import net.zgysrc.www.bean.BookTypes;
import net.zgysrc.www.bean.BookTypesExample;
import net.zgysrc.www.dao.BookCommentMapper;
import net.zgysrc.www.dao.BookInfoDynamicSQLMapper;
import net.zgysrc.www.dao.BookInfoMapper;
import net.zgysrc.www.dao.BookListDynamicSQLMapper;
import net.zgysrc.www.dao.BookListMapper;
import net.zgysrc.www.dao.BookTypesMapper;
import net.zgysrc.www.utils.UtilStringBufferToString;

@Service
@Transactional
public class BookInfoService {

	@Autowired
	private BookInfoMapper bookInfoMapper;
	@Autowired
	private BookListMapper bookListMapper;
	@Autowired
	private BookListDynamicSQLMapper bookListDynamicSQLMapper;
	@Autowired
	private BookInfoDynamicSQLMapper bookInfoDynamicSQLMapper;
	@Autowired
	private BookCommentMapper bookCommentMapper;
	@Autowired
	private BookTypesMapper bookTypesMapper;

	public boolean getBookInfoByOther(BookInfo bookInfo) {
		BookInfoExample example = new BookInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookNameEqualTo(bookInfo.getBookName());
		criteria.andBookWriterEqualTo(bookInfo.getBookWriter());
		List<BookInfo> list = bookInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean addBookInfo(BookInfo bookInfo) {
		int state = bookInfoMapper.insert(bookInfo);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public BookInfo getBookInfoById(Integer id) {
		BookInfo bookInfo = bookInfoMapper.selectByPrimaryKey(id);
		if (bookInfo == null) {
			return null;
		} else {
			return bookInfo;
		}
	}

	public boolean addBookList(BookList bookList) {
		int state = bookListMapper.insert(bookList);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public List<BookInfo> getAllBookInfo() {
		List<BookInfo> list = bookInfoMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<Map<String, Object>> getAllBookListByBookInfo(Integer id) {
		BookList lists = new BookList();
		lists.setFatherId(id);
		List<Map<String, Object>> list = bookListDynamicSQLMapper.selectByBean(lists);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<Map<String, Object>> indexBookInfo() {
		BookInfo bookInfo = new BookInfo();
		bookInfo.setIndexInfo("index");
		List<Map<String, Object>> list = bookInfoDynamicSQLMapper.selectByBean(bookInfo);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<Map<String, Object>> getallBookListByFatherId(Object object) {
		BookList bookList = new BookList();
		bookList.setFatherId((Integer) object);
		List<Map<String, Object>> list = bookListDynamicSQLMapper.selectByBean(bookList);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public BookList getBookList(Integer id) {
		BookList bookList = bookListMapper.selectByPrimaryKey(id);
		if (bookList == null) {
			return null;
		} else {
			return bookList;
		}
	}

	public boolean updateBookInfo(BookInfo bookInfo) {
		int state = bookInfoMapper.updateByPrimaryKeySelective(bookInfo);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean updateBookList(BookList bookList) {
		int state = bookListMapper.updateByPrimaryKeySelective(bookList);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean addBookComment(BookComment bookComment) {
		int state = bookCommentMapper.insert(bookComment);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public List<BookComment> getBookComment(Integer id) {
		BookCommentExample example = new BookCommentExample();
		net.zgysrc.www.bean.BookCommentExample.Criteria criteria = example.createCriteria();
		criteria.andFatherIdEqualTo(id);
		List<BookComment> list = bookCommentMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<BookList> getAllBookListByBook(Integer id) {
		BookListExample example = new BookListExample();
		example.setOrderByClause("list_num asc");
		net.zgysrc.www.bean.BookListExample.Criteria criteria = example.createCriteria();
		criteria.andFatherIdEqualTo(id);
		List<BookList> list = bookListMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public boolean deleteBookInfo(Integer id) {
		int state = bookInfoMapper.deleteByPrimaryKey(id);
		BookListExample example = new BookListExample();
		net.zgysrc.www.bean.BookListExample.Criteria criteria = example.createCriteria();
		criteria.andFatherIdEqualTo(id);
		bookListMapper.deleteByExample(example);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean deleteBookList(Integer id) {
		int state = bookListMapper.deleteByPrimaryKey(id);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public List<BookInfo> getHotBookInfo() {
		BookInfoExample example = new BookInfoExample();
		example.setOrderByClause("click_num desc");
		List<BookInfo> list = bookInfoMapper.selectByExample(example);
		List<BookInfo> lists = new ArrayList<BookInfo>();
		if (list.size() == 0) {
			return null;
		} else {
			for (int i = 0; i < 5; i++) {
				if (list.size() == i) {
					break;
				}
				lists.add(list.get(i));
			}
			return lists;
		}
	}

	public List<BookInfo> newBookInfo() {
		BookInfoExample example = new BookInfoExample();
		example.setOrderByClause("book_create_time desc");
		List<BookInfo> list = bookInfoMapper.selectByExample(example);
		List<BookInfo> lists = new ArrayList<BookInfo>();
		if (list.size() == 0) {
			return null;
		} else {
			for (int i = 0; i < 5; i++) {
				if (list.size() == i) {
					break;
				}
				lists.add(list.get(i));
			}
			return lists;
		}
	}

	public BookTypes getBookTypes(String bookType) {
		BookTypesExample example = new BookTypesExample();
		net.zgysrc.www.bean.BookTypesExample.Criteria criteria = example.createCriteria();
		criteria.andBookTypeEqualTo(bookType);
		List<BookTypes> list = bookTypesMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public List<BookInfo> getClassificationBook(BookTypes bookTypes) {
		BookInfoExample example = new BookInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookTypeIdEqualTo(bookTypes.getId());
		List<BookInfo> list = bookInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<BookTypes> getBookType() {
		List<BookTypes> list = bookTypesMapper.selectByExample(null);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}

	public boolean deleteBookComment(Integer id) {
		int state = bookCommentMapper.deleteByPrimaryKey(id);
		if(state == 0){
			return false;
		}else{
			return true;
		}
	}

	public List<BookInfo> getAllBookInfoAdmin(String bookName) {
		BookInfoExample example = new BookInfoExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andBookNameLike(UtilStringBufferToString.stringBufferToString(bookName));
		List<BookInfo> list = bookInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	
	
	
}
