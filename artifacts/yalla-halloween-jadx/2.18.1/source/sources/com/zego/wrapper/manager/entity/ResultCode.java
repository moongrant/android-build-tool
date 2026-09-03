package com.zego.wrapper.manager.entity;

import OooO00o.OooO00o;
import com.facebook.GraphResponse;

/* JADX INFO: loaded from: classes3.dex */
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ResultCode{mCode=");
        sbOooO0o0.append(this.mCode);
        sbOooO0o0.append(", mMsg='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.mMsg, '\'', '}');
    }
}
