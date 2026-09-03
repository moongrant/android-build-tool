package com.app.base.view.emptyView;

import androidx.annotation.DrawableRes;
import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
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
