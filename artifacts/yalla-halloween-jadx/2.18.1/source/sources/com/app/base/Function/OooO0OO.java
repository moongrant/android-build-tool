package com.app.base.Function;

import android.app.Activity;
import com.yalla.yalla.common.model.ApiError;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import p139o00OOOo0.o0ooOOo;
import p154o00Oo0oo.o0000Ooo;
import p254o00ooO0O.o00000O;
import p515o0o0O00.o00O00;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    @Deprecated
    public interface OooO00o {
        void OooO00o();

        void OooO0O0(String str);

        void afterRequest();

        void onError(String str, String str2);

        void onFinish(String str);
    }

    public static class OooO0O0 implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Deprecated
        public Activity f11352OooO00o = o00000O.f34254OooO00o.OooO0O0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Deprecated
        public o000O f11353OooO0O0;

        @Deprecated
        public OooO0O0() {
            if (this.f11353OooO0O0 == null) {
                Objects.requireNonNull(o0ooOOo.OooO00o());
                this.f11353OooO0O0 = new o000O();
            }
        }

        @Override // com.app.base.Function.OooO0OO.OooO00o
        public final void OooO00o() {
            o00O00.OooO0O0("OkHttpCallback ,OkHttpCallback = , onResponseLog");
        }

        @Override // com.app.base.Function.OooO0OO.OooO00o
        public final void OooO0O0(String str) {
            onError(str, "");
        }

        public final void OooO0OO() {
            o00O00.OooO0O0("OkHttpCallback ,OkHttpCallback = , beforeRequest");
        }

        @Override // com.app.base.Function.OooO0OO.OooO00o
        public final void afterRequest() {
            o00O00.OooO0O0("OkHttpCallback ,OkHttpCallback = , afterRequest");
        }

        @Override // com.app.base.Function.OooO0OO.OooO00o
        public void onError(String str, String str2) {
            o00O00.OooO0O0("OkHttpCallback ,OkHttpCallback = , onError");
            o00O00.OooO0O0("onError code = " + str + ", message = " + str2);
            int i = Integer.parseInt(str);
            if (str2 == null) {
                str2 = "";
            }
            ApiError error = new ApiError(i, str2);
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
        }

        @Override // com.app.base.Function.OooO0OO.OooO00o
        public void onFinish(String str) {
            o00O00.OooO0O0("OkHttpCallback ,OkHttpCallback = , onFinish");
        }
    }

    public static Map OooO00o() {
        return o0000Ooo.OooO00o();
    }
}
