package com.yalla.yalla.util.spannableStringUtils;

import android.app.Activity;
import android.text.TextUtils;
import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class SpannableStringModel<Model> extends AbsJavaBean {
    private Activity activity;
    private int color;
    private String content;
    private Model model;
    private boolean isUnderlineText = false;
    private int start = -1;
    private int end = -1;

    public SpannableStringModel(Activity activity, String str, int i) {
        this.activity = activity;
        this.content = str;
        this.color = i;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public int getColor() {
        return this.color;
    }

    public String getContent() {
        return this.content;
    }

    public int getEnd() {
        if (TextUtils.isEmpty(this.content)) {
            this.end = 0;
        } else {
            int i = this.end;
            if (i <= 0 || i > this.content.length()) {
                this.end = this.content.length();
            }
        }
        return this.end;
    }

    public Model getModel() {
        return this.model;
    }

    public int getStart() {
        if (this.start < 0) {
            this.start = 0;
        }
        return this.start;
    }

    public boolean isUnderlineText() {
        return this.isUnderlineText;
    }

    public SpannableStringModel setActivity(Activity activity) {
        this.activity = activity;
        return this;
    }

    public SpannableStringModel setColor(int i) {
        this.color = i;
        return this;
    }

    public SpannableStringModel setContent(String str) {
        this.content = str;
        return this;
    }

    public SpannableStringModel setEnd(int i) {
        this.end = i;
        return this;
    }

    public SpannableStringModel setModel(Model model) {
        this.model = model;
        return this;
    }

    public SpannableStringModel setStart(int i) {
        this.start = i;
        return this;
    }

    public SpannableStringModel setUnderlineText(boolean z) {
        this.isUnderlineText = z;
        return this;
    }

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        return "SpannableStringModel\n {\n\t activity = " + this.activity + "\n\t color = " + this.color + "\n\t isUnderlineText = " + this.isUnderlineText + "\n\t content = '" + this.content + "'\n\t start = " + this.start + "\n\t end = " + this.end + "\n\t model = " + this.model + "\n }";
    }
}
