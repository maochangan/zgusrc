package net.zgysrc.www.beifeng;

import java.util.List;
import java.util.Map;

import net.zgysrc.www.bean.PostRelease;

public interface PostReleaseDynamicSQL {
	
	public List<PostRelease> getPostReleaseByConditionIf(PostRelease postRelease);
	
	public List<PostRelease> getPostReleaseByConditionOr(PostRelease postRelease);
	
	List<Map<String , Object>> selectInfo(PostRelease record);
	
	
}
