package p166o00OoOoo;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes.dex */
public class o0OoO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SharedPreferences f32554OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SharedPreferences.Editor f32555OooO0O0;

    public o0OoO00O(String str) {
        this.f32554OooO00o = null;
        this.f32555OooO0O0 = null;
        if (TextUtils.isEmpty(str)) {
            this.f32554OooO00o = PreferenceManager.getDefaultSharedPreferences(o0000O.f2657OooO00o);
        } else {
            this.f32554OooO00o = o0000O.f2657OooO00o.getSharedPreferences(str, 0);
        }
        this.f32555OooO0O0 = this.f32554OooO00o.edit();
    }

    public final int OooO00o(String str) {
        SharedPreferences sharedPreferences = this.f32554OooO00o;
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt(str, 0);
    }

    public final long OooO0O0(String str, long j) {
        SharedPreferences sharedPreferences = this.f32554OooO00o;
        return sharedPreferences == null ? j : sharedPreferences.getLong(str, j);
    }

    public final String OooO0OO(String str) {
        SharedPreferences sharedPreferences = this.f32554OooO00o;
        return sharedPreferences == null ? "" : sharedPreferences.getString(str, "");
    }

    public final boolean OooO0Oo(String str, boolean z) {
        SharedPreferences sharedPreferences = this.f32554OooO00o;
        return sharedPreferences == null ? z : sharedPreferences.getBoolean(str, z);
    }

    public final boolean OooO0o(String str, long j) {
        SharedPreferences.Editor editor = this.f32555OooO0O0;
        if (editor == null) {
            return false;
        }
        return editor.putLong(str, j).commit();
    }

    public final boolean OooO0o0(String str, int i) {
        SharedPreferences.Editor editor = this.f32555OooO0O0;
        if (editor == null) {
            return false;
        }
        return editor.putInt(str, i).commit();
    }

    public final boolean OooO0oO(String str, String str2) {
        SharedPreferences.Editor editor = this.f32555OooO0O0;
        if (editor == null) {
            return false;
        }
        return editor.putString(str, str2).commit();
    }

    public final boolean OooO0oo(String str, boolean z) {
        SharedPreferences.Editor editor = this.f32555OooO0O0;
        if (editor == null) {
            return false;
        }
        return editor.putBoolean(str, z).commit();
    }
}
