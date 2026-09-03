package com.geetest.captcha;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/geetest/captcha/model/ErrorBean;", "", "", "toJson", "code", "Ljava/lang/String;", "Lorg/json/JSONObject;", "desc", "Lorg/json/JSONObject;", "msg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "Companion", "captcha_release"}, k = 1, mv = {1, 4, 0})
public final class u {
    public static final a a = new a(0);
    private final String b;
    private final String c;
    private final JSONObject d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/geetest/captcha/model/ErrorBean$Companion;", "", "()V", "build", "Lcom/geetest/captcha/model/ErrorBean;", "code", "", "msg", "desc", "Lorg/json/JSONObject;", "description", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        @NotNull
        public static u a(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
            return new u(str, str2, jSONObject, (byte) 0);
        }
    }

    private u(String str, String str2, JSONObject jSONObject) {
        this.b = str;
        this.c = str2;
        this.d = jSONObject;
    }

    @NotNull
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.b);
            jSONObject.put("msg", this.c);
            jSONObject.put("desc", this.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String string = jSONObject.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "jsonObject.toString()");
        return string;
    }

    public /* synthetic */ u(String str, String str2, JSONObject jSONObject, byte b) {
        this(str, str2, jSONObject);
    }
}
