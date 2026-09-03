package com.zego.wrapper.manager.entity;

import com.facebook.GraphResponse;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes5.dex */
public final class ResultCode {
    private static final int OK = 0;
    public static final ResultCode RESULT_CODE_SUCCESS = new ResultCode(0, GraphResponse.SUCCESS_KEY);
    private int mCode;
    private String mMsg;

    public ResultCode(int i, String str) {
        this.mCode = i;
        this.mMsg = str;
    }

    public int getCode() {
        return this.mCode;
    }

    public String getMsg() {
        return this.mMsg;
    }

    public boolean isSuccess() {
        return this.mCode == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResultCode{mCode=");
        sb.append(this.mCode);
        sb.append(", mMsg='");
        return o0O00o0.OooO0O0(sb, this.mMsg, "'}");
    }
}
