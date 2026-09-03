package com.yalla.yalla.ui.view.emptyView;

import androidx.annotation.DrawableRes;
import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class EmptyFriendModel extends AbsJavaBean {
    private int imageId;
    private String text;

    public EmptyFriendModel(@DrawableRes int i, String str) {
        this.imageId = i;
        this.text = str;
    }

    public int getImageId() {
        return this.imageId;
    }

    public String getText() {
        return this.text;
    }

    public EmptyFriendModel setImageId(@DrawableRes int i) {
        this.imageId = i;
        return this;
    }

    public EmptyFriendModel setText(String str) {
        this.text = str;
        return this;
    }
}
