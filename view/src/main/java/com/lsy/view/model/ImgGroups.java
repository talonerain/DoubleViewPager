package com.lsy.view.model;

import java.util.List;

/**
 * Created by lsy on 2018/3/14.
 */

public class ImgGroups {
    public String groupName;    //要显示的图片分组名称
    public List<String> imgList;

    public ImgGroups(String name, List<String> imgList) {
        this.groupName = name;
        this.imgList = imgList;
    }
}
