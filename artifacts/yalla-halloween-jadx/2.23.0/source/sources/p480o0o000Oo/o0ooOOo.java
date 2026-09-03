package p480o0o000Oo;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.code.android.util.o000O0;

/* JADX INFO: loaded from: classes4.dex */
public class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SharedPreferences f47688OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SharedPreferences.Editor f47689OooO0O0;

    public o0ooOOo(String str) {
        this.f47688OooO00o = null;
        this.f47689OooO0O0 = null;
        if (TextUtils.isEmpty(str)) {
            this.f47688OooO00o = PreferenceManager.getDefaultSharedPreferences(o000O0.f10354OooO00o);
        } else {
            this.f47688OooO00o = o000O0.f10354OooO00o.getSharedPreferences(str, 0);
        }
        this.f47689OooO0O0 = this.f47688OooO00o.edit();
    }

    public final String OooO00o(String str) {
        SharedPreferences sharedPreferences = this.f47688OooO00o;
        return sharedPreferences == null ? "" : sharedPreferences.getString(str, "");
    }

    public final boolean OooO0O0(String str, boolean z) {
        SharedPreferences sharedPreferences = this.f47688OooO00o;
        return sharedPreferences == null ? z : sharedPreferences.getBoolean(str, z);
    }

    public final void OooO0OO(int i, String str) {
        SharedPreferences.Editor editor = this.f47689OooO0O0;
        if (editor == null) {
            return;
        }
        editor.putInt(str, i).commit();
    }

    public final void OooO0Oo(long j, String str) {
        SharedPreferences.Editor editor = this.f47689OooO0O0;
        if (editor == null) {
            return;
        }
        editor.putLong(str, j).commit();
    }

    public final boolean OooO0o(String str, boolean z) {
        SharedPreferences.Editor editor = this.f47689OooO0O0;
        if (editor == null) {
            return false;
        }
        return editor.putBoolean(str, z).commit();
    }

    public final void OooO0o0(String str, String str2) {
        SharedPreferences.Editor editor = this.f47689OooO0O0;
        if (editor == null) {
            return;
        }
        editor.putString(str, str2).commit();
    }
}
