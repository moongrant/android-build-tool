package androidx.media3.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO0 implements SessionToken.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f9468OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f9469OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f9470OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f9471OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f9472OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f9473OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final ComponentName f9474OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final IBinder f9475OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Bundle f9476OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f9459OooOOO0 = p080o000OoO.o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f9458OooOOO = p080o000OoO.o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f9460OooOOOO = p080o000OoO.o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final String f9461OooOOOo = p080o000OoO.o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final String f9463OooOOo0 = p080o000OoO.o00.Oooo00o(4);

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final String f9462OooOOo = p080o000OoO.o00.Oooo00o(5);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final String f9464OooOOoo = p080o000OoO.o00.Oooo00o(6);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final String f9466OooOo00 = p080o000OoO.o00.Oooo00o(7);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final String f9465OooOo0 = p080o000OoO.o00.Oooo00o(8);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final o00O0O0O f9467OooOo0O = new o00O0O0O();

    public o00O0OO0(int i, int i2, int i3, int i4, String str, String str2, @Nullable ComponentName componentName, @Nullable IBinder iBinder, Bundle bundle) {
        this.f9469OooO0Oo = i;
        this.f9471OooO0o0 = i2;
        this.f9470OooO0o = i3;
        this.f9472OooO0oO = i4;
        this.f9473OooO0oo = str;
        this.f9468OooO = str2;
        this.f9474OooOO0 = componentName;
        this.f9475OooOO0O = iBinder;
        this.f9476OooOO0o = bundle;
    }

    @Override // androidx.media3.session.SessionToken.OooO00o
    public final int OooO00o() {
        return this.f9469OooO0Oo;
    }

    @Override // androidx.media3.session.SessionToken.OooO00o
    @Nullable
    public final ComponentName OooO0O0() {
        return this.f9474OooOO0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o00O0OO0)) {
            return false;
        }
        o00O0OO0 o00o0oo1 = (o00O0OO0) obj;
        return this.f9469OooO0Oo == o00o0oo1.f9469OooO0Oo && this.f9471OooO0o0 == o00o0oo1.f9471OooO0o0 && this.f9470OooO0o == o00o0oo1.f9470OooO0o && this.f9472OooO0oO == o00o0oo1.f9472OooO0oO && TextUtils.equals(this.f9473OooO0oo, o00o0oo1.f9473OooO0oo) && TextUtils.equals(this.f9468OooO, o00o0oo1.f9468OooO) && p080o000OoO.o00.OooO00o(this.f9474OooOO0, o00o0oo1.f9474OooOO0) && p080o000OoO.o00.OooO00o(this.f9475OooOO0O, o00o0oo1.f9475OooOO0O);
    }

    @Override // androidx.media3.session.SessionToken.OooO00o
    public final String getPackageName() {
        return this.f9473OooO0oo;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9469OooO0Oo), Integer.valueOf(this.f9471OooO0o0), Integer.valueOf(this.f9470OooO0o), Integer.valueOf(this.f9472OooO0oO), this.f9473OooO0oo, this.f9468OooO, this.f9474OooOO0, this.f9475OooOO0O});
    }

    @Override // androidx.media3.common.OooO0OO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9459OooOOO0, this.f9469OooO0Oo);
        bundle.putInt(f9458OooOOO, this.f9471OooO0o0);
        bundle.putInt(f9460OooOOOO, this.f9470OooO0o);
        bundle.putString(f9461OooOOOo, this.f9473OooO0oo);
        bundle.putString(f9463OooOOo0, this.f9468OooO);
        p063o0000oO.Oooo0.OooO0O0(bundle, f9464OooOOoo, this.f9475OooOO0O);
        bundle.putParcelable(f9462OooOOo, this.f9474OooOO0);
        bundle.putBundle(f9466OooOo00, this.f9476OooOO0o);
        bundle.putInt(f9465OooOo0, this.f9472OooO0oO);
        return bundle;
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.f9473OooO0oo + " type=" + this.f9471OooO0o0 + " libraryVersion=" + this.f9470OooO0o + " interfaceVersion=" + this.f9472OooO0oO + " service=" + this.f9468OooO + " IMediaSession=" + this.f9475OooOO0O + " extras=" + this.f9476OooOO0o + "}";
    }
}
