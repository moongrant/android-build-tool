package com.app.base.util.spannableStringUtils;

import OooO00o.OooO00o;
import android.app.Activity;
import android.text.TextUtils;
import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
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

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SpannableStringModel\n {\n\t activity = ");
        sbOooO0o0.append(this.activity);
        sbOooO0o0.append("\n\t color = ");
        sbOooO0o0.append(this.color);
        sbOooO0o0.append("\n\t isUnderlineText = ");
        sbOooO0o0.append(this.isUnderlineText);
        sbOooO0o0.append("\n\t content = '");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.content, '\'', "\n\t start = ");
        sbOooO0o0.append(this.start);
        sbOooO0o0.append("\n\t end = ");
        sbOooO0o0.append(this.end);
        sbOooO0o0.append("\n\t model = ");
        sbOooO0o0.append(this.model);
        sbOooO0o0.append("\n ");
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
