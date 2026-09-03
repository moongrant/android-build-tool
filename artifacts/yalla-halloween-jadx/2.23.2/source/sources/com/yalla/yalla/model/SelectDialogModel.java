package com.yalla.yalla.model;

import androidx.annotation.NonNull;
import com.yalla.yalla.model.bean.AbsJavaBean;
import p202o00o0o.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
public class SelectDialogModel<Model> extends AbsJavaBean implements o0OoOo0 {
    private CharSequence content;
    private boolean isSelect = false;
    private Model model;
    private int tag;

    public CharSequence getContent() {
        return this.content;
    }

    public Model getModel() {
        return this.model;
    }

    @Override // p202o00o0o.o0OoOo0
    @NonNull
    public String getShowText() {
        return this.content.toString();
    }

    public int getTag() {
        return this.tag;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public SelectDialogModel<Model> setContent(int i, String str) {
        this.tag = i;
        this.content = str;
        return this;
    }

    public SelectDialogModel<Model> setModel(Model model) {
        this.model = model;
        return this;
    }

    public SelectDialogModel<Model> setSelect(boolean z) {
        this.isSelect = z;
        return this;
    }

    public SelectDialogModel<Model> setContent(String str) {
        this.content = str;
        return this;
    }

    public SelectDialogModel<Model> setContent(CharSequence charSequence) {
        this.content = charSequence;
        return this;
    }
}
