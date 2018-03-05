package net.zgysrc.www.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.zgysrc.www.bean.BookComment;
import net.zgysrc.www.bean.BookInfo;
import net.zgysrc.www.bean.BookList;
import net.zgysrc.www.bean.BookTypes;
import net.zgysrc.www.bean.SimpleUser;
import net.zgysrc.www.service.BookInfoService;
import net.zgysrc.www.utils.Configuration;
import net.zgysrc.www.utils.Msg;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "bookInfoController")
@Controller
public class BookInfoController {

	@Autowired
	private BookInfoService bookInfoService;

	/**
	 * 首页图书列表
	 * 
	 * 不用
	 */
	@ResponseBody
	@RequestMapping(value = "/indexBookInfo", method = RequestMethod.GET)
	public Msg indexBookInfo() {
		List<Map<String, Object>> list = bookInfoService.indexBookInfo();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			for (int i = 0; i < list.size(); i++) {
				List<Map<String, Object>> lists = bookInfoService.getallBookListByFatherId(list.get(i).get("id"));
				for (int j = 0; j < lists.size(); j++) {
					list.get(i).put("listName" + j, lists.get(j).get("bookListName"));
					list.get(i).put("listId" + j, lists.get(j).get("id"));
				}
			}
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 热门书籍
	 */
	@ResponseBody
	@RequestMapping(value = "/hotBookInfo", method = RequestMethod.GET)
	public Msg hotBookInfo() {
		List<BookInfo> list = bookInfoService.getHotBookInfo();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 最新书籍
	 */
	@ResponseBody
	@RequestMapping(value = "/newBookInfo", method = RequestMethod.GET)
	public Msg newBookInfo() {
		List<BookInfo> list = bookInfoService.newBookInfo();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 创建书
	 * 
	 * @param bookInfo
	 * @return
	 * @throws Exception
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/addBookInfo", method = RequestMethod.POST)
	public Msg getAllArtGallery(BookInfo bookInfo, MultipartFile files, HttpServletRequest request)
			throws IllegalStateException, Exception {
		if (files.getOriginalFilename() == null) {
			boolean check = bookInfoService.getBookInfoByOther(bookInfo);
			if (check) {
				bookInfo.setClickNum(0);
				bookInfo.setCollectionNum(0);
				BookTypes bookTypes = bookInfoService.getBookTypes(bookInfo.getBookType());
				if (bookTypes == null) {
					SimpleDateFormat adf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
					String date = adf.format(new Date());
					bookInfo.setBookCreateTime(date);
					bookInfo.setBookPrice("0");
					boolean state = bookInfoService.addBookInfo(bookInfo);
					if (state) {
						String msg = "创建成功！";
						return Msg.success().add("msg", msg);
					} else {
						String msg = "创建失败！";
						return Msg.fail().add("msg", msg);
					}
				} else {
					bookInfo.setBookTypeId(bookTypes.getId());
					SimpleDateFormat adf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
					String date = adf.format(new Date());
					bookInfo.setBookCreateTime(date);
					bookInfo.setBookPrice("0");
					boolean state = bookInfoService.addBookInfo(bookInfo);
					if (state) {
						String msg = "创建成功！";
						return Msg.success().add("msg", msg);
					} else {
						String msg = "创建失败！";
						return Msg.fail().add("msg", msg);
					}
				}
			} else {
				String msg = "已存在！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/books/"
					+ bookInfo.getBookName() + "/" + files.getOriginalFilename();
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			files.transferTo(dir);
			String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
					+ request.getServletContext().getContextPath() + "/files/pic/books/" + bookInfo.getBookName() + "/"
					+ files.getOriginalFilename();
			boolean check = bookInfoService.getBookInfoByOther(bookInfo);
			if (check) {
				bookInfo.setClickNum(0);
				bookInfo.setCollectionNum(0);
				bookInfo.setBookInfoImagePath(dataPath);
				BookTypes bookTypes = bookInfoService.getBookTypes(bookInfo.getBookType());
				if (bookTypes == null) {
					SimpleDateFormat adf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
					String date = adf.format(new Date());
					bookInfo.setBookCreateTime(date);
					bookInfo.setBookPrice("0");
					boolean state = bookInfoService.addBookInfo(bookInfo);
					if (state) {
						String msg = "创建成功！";
						return Msg.success().add("msg", msg);
					} else {
						String msg = "创建失败！";
						return Msg.fail().add("msg", msg);
					}
				} else {
					bookInfo.setBookTypeId(bookTypes.getId());
					SimpleDateFormat adf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
					String date = adf.format(new Date());
					bookInfo.setBookCreateTime(date);
					bookInfo.setBookPrice("0");
					boolean state = bookInfoService.addBookInfo(bookInfo);
					if (state) {
						String msg = "创建成功！";
						return Msg.success().add("msg", msg);
					} else {
						String msg = "创建失败！";
						return Msg.fail().add("msg", msg);
					}
				}
			} else {
				String msg = "已存在！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 修改书
	 */
	@ResponseBody
	@RequestMapping(value = "/updateBookInfo", method = RequestMethod.GET)
	public Msg updateBookInfo(BookInfo bookInfo, MultipartFile files, HttpServletRequest request)
			throws IllegalStateException, Exception {
		if (files.getOriginalFilename() == null) {
			boolean state = bookInfoService.updateBookInfo(bookInfo);
			if (state) {
				String msg = "修改成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "修改失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/books/"
					+ bookInfo.getBookName() + "/" + files.getOriginalFilename();
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			files.transferTo(dir);
			String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
					+ request.getServletContext().getContextPath() + "/files/pic/books/" + bookInfo.getBookName() + "/"
					+ files.getOriginalFilename();
			bookInfo.setBookInfoImagePath(dataPath);
			boolean state = bookInfoService.updateBookInfo(bookInfo);
			if (state) {
				String msg = "修改成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "修改失败！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 创建目录文章
	 * 
	 * @throws Exception
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/addBookList", method = RequestMethod.POST)
	public Msg addBookList(Integer id, BookList bookList, MultipartFile files, HttpServletRequest request)
			throws IllegalStateException, Exception {
		BookInfo bookInfo = bookInfoService.getBookInfoById(id);
		bookList.setId(null);
		if (files.getOriginalFilename() != null) {
			String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/books/"
					+ bookInfo.getBookName() + "/" + bookList.getBookListName() + "/" + files.getOriginalFilename();
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			files.transferTo(dir);
			String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
					+ request.getServletContext().getContextPath() + "/files/pic/books/" + bookInfo.getBookName() + "/"
					+ bookList.getBookListName() + "/" + files.getOriginalFilename();
			bookList.setBookImagePathOne(dataPath);
			bookList.setFatherId(id);
			bookList.setLikeNum(0);
			bookList.setBookClickNum(0);
			boolean state = bookInfoService.addBookList(bookList);
			if (state) {
				String msg = "创建成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "创建失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "无发现图片！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 修改目录文章
	 * 
	 * @throws Exception
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/updateBookList", method = RequestMethod.GET)
	public Msg updateBookList(BookList bookList, MultipartFile files, HttpServletRequest request)
			throws IllegalStateException, Exception {
		BookInfo bookInfo = bookInfoService.getBookInfoById(bookList.getFatherId());
		if (files.getOriginalFilename() == null) {
			String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/books/"
					+ bookInfo.getBookName() + "/" + bookList.getBookListName() + "/" + files.getOriginalFilename();
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			files.transferTo(dir);
			String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
					+ request.getServletContext().getContextPath() + "/files/pic/books/" + bookInfo.getBookName() + "/"
					+ bookList.getBookListName() + "/" + files.getOriginalFilename();
			bookList.setBookImagePathOne(dataPath);
			boolean state = bookInfoService.addBookList(bookList);
			if (state) {
				String msg = "修改成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "修改失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "无发现图片！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 获取全部图书
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllBookInfo", method = RequestMethod.GET)
	public Msg getAllBookInfo(Integer pn) {
		PageHelper.startPage(pn, 9);
		List<BookInfo> list = bookInfoService.getAllBookInfo();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<BookInfo> pageInfo = new PageInfo<BookInfo>(list);
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * 获取全部图书管理员
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllBookInfoAdmin", method = RequestMethod.GET)
	public Msg getAllBookInfoAdmin(Integer pn, Integer pSize, String bookName) {
		PageHelper.startPage(pn, pSize);
		List<BookInfo> list = bookInfoService.getAllBookInfoAdmin(bookName);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<BookInfo> pageInfo = new PageInfo<BookInfo>(list);
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * 获取全部图书
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllBookInfoList", method = RequestMethod.GET)
	public Msg getAllBookInfoList() {
		List<BookInfo> list = bookInfoService.getAllBookInfo();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 获取全部目录 书id
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllBookListByBookList", method = RequestMethod.GET)
	public Msg getAllBookListByBookList(Integer id) {
		List<BookList> list = bookInfoService.getAllBookListByBook(id);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			BookInfo bookInfo = bookInfoService.getBookInfoById(list.get(0).getFatherId());
			return Msg.success().add("list", list).add("bookInfo", bookInfo);
		}
	}

	/**
	 * 获取书
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getBookInfo", method = RequestMethod.GET)
	public Msg getBookInfo(Integer id) {
		BookInfo bookInfo = bookInfoService.getBookInfoById(id);
		if (bookInfo == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			Integer clickNum = bookInfo.getClickNum();
			clickNum++;
			bookInfo.setClickNum(clickNum);
			bookInfoService.updateBookInfo(bookInfo);
			return Msg.success().add("bookInfo", bookInfo);
		}
	}

	/**
	 * 获取全部目录 书id
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllBookListByBookAll", method = RequestMethod.GET)
	public Msg getAllBookListByBookAll(Integer id, Integer pn, Integer pSize) {
		BookInfo bookInfo = bookInfoService.getBookInfoById(id);
		PageHelper.startPage(pn, pSize);
		List<BookList> list = bookInfoService.getAllBookListByBook(id);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg).add("bookInfo", bookInfo);
		} else {
			PageInfo<BookList> pageInfo = new PageInfo<BookList>(list);
			return Msg.success().add("pageInfo", pageInfo).add("bookInfo", bookInfo);
		}
	}

	/**
	 * 获取全部目录 书id
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllBookListByBook", method = RequestMethod.GET)
	public Msg getAllBookListByBook(Integer id, Integer pn, HttpSession session) {
		BookInfo bookInfo = bookInfoService.getBookInfoById(id);
		PageHelper.startPage(pn, 1);
		SimpleUser user = (SimpleUser) session.getAttribute("simpleUser");
		if ("0".equals(bookInfo.getBookPrice())) {
			List<BookList> list = bookInfoService.getAllBookListByBook(id);
			if (list == null) {
				String msg = "无信息！";
				return Msg.fail().add("msg", msg);
			} else {
				PageInfo<BookList> pageInfo = new PageInfo<BookList>(list);
				return Msg.success().add("pageInfo", pageInfo);
			}
		} else {
			if (pn > 3) {
				if (user != null) {
					if (user.getVipType() != null) {
						List<BookList> list = bookInfoService.getAllBookListByBook(id);
						if (list == null) {
							String msg = "无信息！";
							return Msg.fail().add("msg", msg);
						} else {
							PageInfo<BookList> pageInfo = new PageInfo<BookList>(list);
							return Msg.success().add("pageInfo", pageInfo);
						}
					} else {
						String msg = "需要付费！";
						return Msg.fail().add("msg", msg);
					}
				} else {
					String msg = "请登录！";
					return Msg.fail().add("msg", msg);
				}
			} else {
				List<BookList> list = bookInfoService.getAllBookListByBook(id);
				if (list == null) {
					String msg = "无信息！";
					return Msg.fail().add("msg", msg);
				} else {
					PageInfo<BookList> pageInfo = new PageInfo<BookList>(list);
					return Msg.success().add("pageInfo", pageInfo);
				}
			}
		}
	}

	/**
	 * 章节列表
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllBookList", method = RequestMethod.GET)
	public Msg getAllBookList(Integer id) {
		List<BookList> list = bookInfoService.getAllBookListByBook(id);
		List<BookList> lists = new ArrayList<BookList>();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			for (int i = 0; i < 10; i++) {
				if (list.size() == i) {
					break;
				}
				lists.add(list.get(i));
			}
			return Msg.success().add("list", lists);
		}
	}

	/**
	 * 目录标题 书id
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllBookListByBookInfo", method = RequestMethod.GET)
	public Msg getAllBookListByBookInfo(Integer id) {
		List<Map<String, Object>> list = bookInfoService.getAllBookListByBookInfo(id);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 书下内容 根据目录id
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getBookList", method = RequestMethod.GET)
	public Msg getBookList(Integer id) {
		BookList bookList = bookInfoService.getBookList(id);
		if (bookList == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			Integer click = bookList.getBookClickNum();
			click++;
			bookList.setBookClickNum(click);
			bookInfoService.updateBookList(bookList);
			return Msg.success().add("bookList", bookList);
		}
	}

	/**
	 * 收藏书
	 */
	@ResponseBody
	@RequestMapping(value = "/collectBookInfo", method = RequestMethod.GET)
	public Msg collectBookInfo(Integer id) {
		BookInfo bookInfo = bookInfoService.getBookInfoById(id);
		Integer collectNum = bookInfo.getCollectionNum();
		collectNum++;
		bookInfo.setCollectionNum(collectNum);
		boolean state = bookInfoService.updateBookInfo(bookInfo);
		if (state) {
			String msg = "收藏成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 添加评论
	 * 
	 * @param id
	 * @param bookComment
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/addBookComment", method = RequestMethod.GET)
	public Msg addBookComment(Integer id, BookComment bookComment, HttpSession session) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		}
		bookComment.setSimpleUserId(simpleUser.getId());
		bookComment.setUserName(simpleUser.getSimpleName());
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(date);
		bookComment.setId(null);
		bookComment.setFatherId(id);
		bookComment.setLikeNum(0);
		bookComment.setCreateTime(time);
		boolean state = bookInfoService.addBookComment(bookComment);
		if (state) {
			String msg = "发表成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "发表失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 评论
	 * 
	 * @param pn
	 *            页数
	 * @param id
	 *            文章id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getBookComment", method = RequestMethod.GET)
	public Msg getBookComment(Integer id) {
		List<BookComment> list = bookInfoService.getBookComment(id);
		if (list == null) {
			String msg = "无评论信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 删除品论
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteBookComment", method = RequestMethod.GET)
	public Msg deleteBookComment(Integer id) {
		boolean state = bookInfoService.deleteBookComment(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.fail().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 删除书
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteBookInfo", method = RequestMethod.GET)
	public Msg deleteBookInfo(Integer id) {
		boolean state = bookInfoService.deleteBookInfo(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 删除章节
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteBookList", method = RequestMethod.GET)
	public Msg deleteBookList(Integer id) {
		boolean state = bookInfoService.deleteBookList(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 图书馆分类
	 */
	@ResponseBody
	@RequestMapping(value = "/getBookType", method = RequestMethod.GET)
	public Msg getBookType() {
		List<BookTypes> list = bookInfoService.getBookType();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 分类书籍
	 */
	@ResponseBody
	@RequestMapping(value = "/getClassificationBook", method = RequestMethod.GET)
	public Msg getClassificationBook(BookTypes bookTypes, Integer pn) {
		PageHelper.startPage(pn, 8);
		List<BookInfo> list = bookInfoService.getClassificationBook(bookTypes);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<BookInfo> pageInfo = new PageInfo<BookInfo>(list);
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * 书籍付费设置
	 */
	@ResponseBody
	@RequestMapping(value = "/bookPriceSet", method = RequestMethod.GET)
	public Msg bookPriceSet(BookInfo bookInfo) {
		boolean state = bookInfoService.updateBookInfo(bookInfo);
		if (state) {
			String msg = "设置成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "设置失败！";
			return Msg.fail().add("msg", msg);
		}
	}

}
