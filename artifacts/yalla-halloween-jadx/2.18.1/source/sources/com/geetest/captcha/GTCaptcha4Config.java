package com.geetest.captcha;

import com.qiniu.android.http.ResponseInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class GTCaptcha4Config implements NoProguard {
    private final boolean a;
    private final String b;
    private final String c;
    private final Map<String, Object> d;
    private final boolean e;
    private final int f;
    private final int g;
    private final String h;

    public static class Builder implements NoProguard {
        private boolean a = false;
        private String b = null;
        private String c = "file:///android_asset/gt4-index.html";
        private Map<String, Object> d = null;
        private boolean e = true;
        private int f = ResponseInfo.UnknownError;
        private int g = 0;
        private String h = null;

        public GTCaptcha4Config build() {
            return new GTCaptcha4Config(this);
        }

        public Builder setBackgroundColor(int i) {
            this.g = i;
            return this;
        }

        public Builder setCanceledOnTouchOutside(boolean z) {
            this.e = z;
            return this;
        }

        public Builder setDebug(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setDialogStyle(String str) {
            this.h = str;
            return this;
        }

        public Builder setLanguage(String str) {
            this.b = str;
            return this;
        }

        public Builder setParams(Map<String, Object> map) {
            this.d = map;
            return this;
        }

        public Builder setResourcePath(String str) {
            this.c = str;
            return this;
        }

        public Builder setTimeOut(int i) {
            this.f = i;
            return this;
        }
    }

    public int getBackgroundColor() {
        return this.g;
    }

    public String getDialogStyle() {
        return this.h;
    }

    public String getHtml() {
        return this.c;
    }

    public String getLanguage() {
        return this.b;
    }

    public Map<String, Object> getParams() {
        return this.d;
    }

    public int getTimeOut() {
        return this.f;
    }

    public boolean isCanceledOnTouchOutside() {
        return this.e;
    }

    public boolean isDebug() {
        return this.a;
    }

    private GTCaptcha4Config(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
    }
}
