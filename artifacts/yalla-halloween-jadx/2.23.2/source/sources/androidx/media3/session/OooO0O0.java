package androidx.media3.session;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f9241OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final SessionCommand f9242OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @DrawableRes
    public final int f9243OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f9244OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CharSequence f9245OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @UnstableApi
    public final Bundle f9246OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f9234OooOO0 = p080o000OoO.o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f9235OooOO0O = p080o000OoO.o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f9236OooOO0o = p080o000OoO.o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f9238OooOOO0 = p080o000OoO.o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f9237OooOOO = p080o000OoO.o00.Oooo00o(4);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f9239OooOOOO = p080o000OoO.o00.Oooo00o(5);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @UnstableApi
    public static final OooO00o f9240OooOOOo = new OooO00o(0);

    public OooO0O0(@Nullable SessionCommand sessionCommand, int i, @DrawableRes int i2, CharSequence charSequence, Bundle bundle, boolean z) {
        this.f9242OooO0Oo = sessionCommand;
        this.f9244OooO0o0 = i;
        this.f9243OooO0o = i2;
        this.f9245OooO0oO = charSequence;
        this.f9246OooO0oo = new Bundle(bundle);
        this.f9241OooO = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        return com.google.common.base.Oooo0.OooO00o(this.f9242OooO0Oo, oooO0O0.f9242OooO0Oo) && this.f9244OooO0o0 == oooO0O0.f9244OooO0o0 && this.f9243OooO0o == oooO0O0.f9243OooO0o && TextUtils.equals(this.f9245OooO0oO, oooO0O0.f9245OooO0oO) && this.f9241OooO == oooO0O0.f9241OooO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9242OooO0Oo, Integer.valueOf(this.f9244OooO0o0), Integer.valueOf(this.f9243OooO0o), this.f9245OooO0oO, Boolean.valueOf(this.f9241OooO)});
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        SessionCommand sessionCommand = this.f9242OooO0Oo;
        if (sessionCommand != null) {
            bundle.putBundle(f9234OooOO0, sessionCommand.toBundle());
        }
        bundle.putInt(f9235OooOO0O, this.f9244OooO0o0);
        bundle.putInt(f9236OooOO0o, this.f9243OooO0o);
        bundle.putCharSequence(f9238OooOOO0, this.f9245OooO0oO);
        bundle.putBundle(f9237OooOOO, this.f9246OooO0oo);
        bundle.putBoolean(f9239OooOOOO, this.f9241OooO);
        return bundle;
    }
}
