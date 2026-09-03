package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0;

import OooO00o.OooO0O0;
import OooO00o.OooOOO;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AuthResponse;
import java.util.Objects;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0Oo.o00O0O;
import p003OooO0Oo.o0ooOOo;
import p625o0oo0oo.o000OO0O;
import p627o0oo0ooO.oO0O0Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends p003OooO0Oo.Oooo000 implements OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public p003OooO0Oo.OooOo00 f39OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<OooO00o.OooOo, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OooO00o.OooOo oooOo) {
            OooO00o.OooOo setRequestVersionsCallback = oooOo;
            Intrinsics.checkNotNullParameter(setRequestVersionsCallback, "$this$setRequestVersionsCallback");
            p003OooO0Oo.OooOo00 oooOo00 = o0OoOo0.this.f39OooO0O0;
            o00O0O o00o0o2 = oooOo00.f108OooO0Oo;
            if (o00o0o2 != null) {
                o00o0o2.f116OooO00o = OooO00o.OooOo.f86OooO0O0;
            }
            oooOo00.OooO0oo();
            return Unit.INSTANCE;
        }
    }

    public o0OoOo0(@NotNull p003OooO0Oo.OooOo00 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f39OooO0O0 = baseClient;
    }

    @Override // OooO00o.OooO0O0
    public final void OooO00o(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f39OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, "", 1));
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0O0(@Nullable OooO00o.OooOOOO oooOOOO) {
        if (oooOOOO == null) {
            this.f39OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, "", 1));
        }
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0OO(@NotNull OooO00o.OooOOOO data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    public final void OooO0o() {
        o00O0O o00o0o2;
        OooO00o.OooOo appInfo = OooO00o.OooOo.f86OooO0O0;
        FragmentActivity act = this.f39OooO0O0.OooO0o0();
        Intrinsics.checkNotNullParameter(act, "context");
        Intrinsics.checkNotNullParameter(act, "act");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Context applicationContext = act.getApplicationContext();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        String[] strArr = {"versions"};
        PackageManager packageManager = applicationContext.getPackageManager();
        Uri uri = Uri.parse("content://com.yallatech.support.open.YlOpenContentProvider/versions");
        byte b = 0;
        Unit unit = null;
        Unit unit2 = null;
        Cursor cursor = null;
        if (packageManager.resolveContentProvider("com.yallatech.support.open.YlOpenContentProvider", 0) != null) {
            try {
                Cursor cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    String string = "";
                    while (cursorQuery.moveToNext()) {
                        try {
                            string = cursorQuery.getString(cursorQuery.getColumnIndex("auth_sdk_version"));
                            Intrinsics.checkNotNullExpressionValue(string, "getString(getColumnIndex…IDER_SDK_VERSION_COLUMN))");
                            cursorQuery.getInt(cursorQuery.getColumnIndex("auth_service_version"));
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            try {
                                String msg = Intrinsics.stringPlus("Failed to query content resolver.\n", ExceptionsKt.stackTraceToString(th));
                                Intrinsics.checkNotNullParameter(msg, "msg");
                                if (o000OO0O.f48670OooO0O0) {
                                    Log.e(o000OO0O.f48669OooO00o, msg);
                                }
                                b = -3;
                                if (cursor != null) {
                                    cursorQuery = cursor;
                                }
                                unit = Unit.INSTANCE;
                                if (unit == null) {
                                    Intrinsics.checkNotNullParameter("Failed to query content resolver.", "msg");
                                    if (o000OO0O.f48670OooO0O0) {
                                        Log.e(o000OO0O.f48669OooO00o, "Failed to query content resolver.");
                                    }
                                    b = -2;
                                }
                                if (b != 0) {
                                    p003OooO0Oo.OooOo00 oooOo00 = this.f39OooO0O0;
                                    o00o0o2 = oooOo00.f108OooO0Oo;
                                    if (o00o0o2 != null) {
                                        o00o0o2.f116OooO00o = appInfo;
                                    }
                                    oooOo00.OooO0oo();
                                    return;
                                }
                                OooOOO oooOOO = this.f39OooO0O0.f109OooO0o;
                                OooO00o callback = new OooO00o();
                                Objects.requireNonNull(oooOOO);
                                Intrinsics.checkNotNullParameter(callback, "callback");
                                oooOOO.f79OooO0Oo = callback;
                                try {
                                    OooOOO oooOOO2 = this.f39OooO0O0.f109OooO0o;
                                    Objects.requireNonNull(oooOOO2);
                                    Intrinsics.checkNotNullParameter(this, "bizClient");
                                    oooOOO2.f78OooO0OO = this;
                                    this.f39OooO0O0.f109OooO0o.OooO0O0();
                                } catch (Exception unused) {
                                    p003OooO0Oo.OooOo00 oooOo01 = this.f39OooO0O0;
                                    oooOo01.OooO0Oo(oooOo01.OooO00o(100034, oooOo01.OooO0o0().getString(oO0O0Oo0.base_platform_app_version_too_low)));
                                    return;
                                }
                            } catch (Throwable th2) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th2;
                            }
                        }
                    }
                    appInfo.OooO00o(string);
                    unit2 = Unit.INSTANCE;
                }
                b = unit2 == null ? (byte) -1 : (byte) 0;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th3) {
                th = th3;
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Intrinsics.checkNotNullParameter("Failed to query content resolver.", "msg");
            if (o000OO0O.f48670OooO0O0) {
                Log.e(o000OO0O.f48669OooO00o, "Failed to query content resolver.");
            }
            b = -2;
        }
        if (b != 0) {
            p003OooO0Oo.OooOo00 oooOo02 = this.f39OooO0O0;
            o00o0o2 = oooOo02.f108OooO0Oo;
            if (o00o0o2 != null) {
                o00o0o2.f116OooO00o = appInfo;
            }
            oooOo02.OooO0oo();
            return;
        }
        OooOOO oooOOO3 = this.f39OooO0O0.f109OooO0o;
        OooO00o callback2 = new OooO00o();
        Objects.requireNonNull(oooOOO3);
        Intrinsics.checkNotNullParameter(callback2, "callback");
        oooOOO3.f79OooO0Oo = callback2;
        OooOOO oooOOO4 = this.f39OooO0O0.f109OooO0o;
        Objects.requireNonNull(oooOOO4);
        Intrinsics.checkNotNullParameter(this, "bizClient");
        oooOOO4.f78OooO0OO = this;
        this.f39OooO0O0.f109OooO0o.OooO0O0();
    }

    @Override // p003OooO0Oo.Oooo000
    public final void OooO0o0() {
        if (OooO0Oo()) {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new o0ooOOo(this, 0));
        } else {
            OooO0o();
        }
    }
}
