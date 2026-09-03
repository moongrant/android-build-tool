package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0;

import OooO0O0.OooOOO;
import OooO0O0.OooOOO0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AuthResponse;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0o0.o000000O;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.o0Oo0oo;
import p003OooO0o0.oo000o;
import p604o0oo0OO.o00000;
import p605o0oo0OO0.o000O;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends oo000o implements OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f64OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<OooO0O0.OooOo00, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OooO0O0.OooOo00 oooOo00) {
            OooO0O0.OooOo00 setRequestVersionsCallback = oooOo00;
            Intrinsics.checkNotNullParameter(setRequestVersionsCallback, "$this$setRequestVersionsCallback");
            o00Oo0 o00oo1 = o0OoOo0.this.f64OooO0O0;
            o0Oo0oo o0oo0oo2 = o00oo1.f132OooO0Oo;
            if (o0oo0oo2 != null) {
                o0oo0oo2.f143OooO00o = OooO0O0.OooOo00.f109OooO0O0;
            }
            o00oo1.OooO0oo();
            return Unit.INSTANCE;
        }
    }

    public o0OoOo0(@NotNull o00Oo0 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f64OooO0O0 = baseClient;
    }

    @Override // OooO0O0.OooO00o
    public final void OooO00o(@Nullable OooOOO oooOOO) {
        if (oooOOO == null) {
            this.f64OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, "", 1));
        }
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0O0(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f64OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, "", 1));
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0OO(@NotNull OooOOO data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    public final void OooO0o() {
        o0Oo0oo o0oo0oo2;
        OooO0O0.OooOo00 appInfo = OooO0O0.OooOo00.f109OooO0O0;
        o00Oo0 o00oo1 = this.f64OooO0O0;
        FragmentActivity act = o00oo1.OooO0o0();
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
                                if (o000O.f56902OooO0O0) {
                                    Log.e(o000O.f56901OooO00o, msg);
                                }
                                b = -3;
                                if (cursor != null) {
                                    cursorQuery = cursor;
                                }
                                unit = Unit.INSTANCE;
                                if (unit == null) {
                                    Intrinsics.checkNotNullParameter("Failed to query content resolver.", "msg");
                                    if (o000O.f56902OooO0O0) {
                                        Log.e(o000O.f56901OooO00o, "Failed to query content resolver.");
                                    }
                                    b = -2;
                                }
                                if (b != 0) {
                                    o0oo0oo2 = o00oo1.f132OooO0Oo;
                                    if (o0oo0oo2 != null) {
                                        o0oo0oo2.f143OooO00o = appInfo;
                                    }
                                    o00oo1.OooO0oo();
                                    return;
                                }
                                OooO00o callback = new OooO00o();
                                OooOOO0 oooOOO0 = o00oo1.f133OooO0o;
                                oooOOO0.getClass();
                                Intrinsics.checkNotNullParameter(callback, "callback");
                                oooOOO0.f107OooO0Oo = callback;
                                try {
                                    oooOOO0.getClass();
                                    Intrinsics.checkNotNullParameter(this, "bizClient");
                                    oooOOO0.f106OooO0OO = this;
                                    oooOOO0.OooO0OO(appInfo);
                                } catch (Exception unused) {
                                    o00oo1.OooO0Oo(o00oo1.OooO00o(100034, o00oo1.OooO0o0().getString(o00000.base_platform_app_version_too_low)));
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
                    appInfo.getClass();
                    Intrinsics.checkNotNullParameter(string, "<set-?>");
                    appInfo.f95OooO00o = string;
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
            if (o000O.f56902OooO0O0) {
                Log.e(o000O.f56901OooO00o, "Failed to query content resolver.");
            }
            b = -2;
        }
        if (b != 0) {
            o0oo0oo2 = o00oo1.f132OooO0Oo;
            if (o0oo0oo2 != null) {
                o0oo0oo2.f143OooO00o = appInfo;
            }
            o00oo1.OooO0oo();
            return;
        }
        OooO00o callback2 = new OooO00o();
        OooOOO0 oooOOO1 = o00oo1.f133OooO0o;
        oooOOO1.getClass();
        Intrinsics.checkNotNullParameter(callback2, "callback");
        oooOOO1.f107OooO0Oo = callback2;
        oooOOO1.getClass();
        Intrinsics.checkNotNullParameter(this, "bizClient");
        oooOOO1.f106OooO0OO = this;
        oooOOO1.OooO0OO(appInfo);
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        if (oo000o.OooO0Oo()) {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new o000000O(this, 0));
        } else {
            OooO0o();
        }
    }
}
