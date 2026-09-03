package androidx.media3.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.media3.common.Player;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Player.OooO00o f9223OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f9224OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOOO0 f9225OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f9226OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final PendingIntent f9227OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oo00o f9228OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Player.OooO00o f9229OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Bundle f9230OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o00O00O f9231OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ImmutableList<OooO0O0> f9232OooOOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f9213OooOOO = p080o000OoO.o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f9214OooOOOO = p080o000OoO.o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final String f9215OooOOOo = p080o000OoO.o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final String f9217OooOOo0 = p080o000OoO.o00.Oooo00o(9);

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final String f9216OooOOo = p080o000OoO.o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final String f9218OooOOoo = p080o000OoO.o00.Oooo00o(4);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final String f9220OooOo00 = p080o000OoO.o00.Oooo00o(5);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final String f9219OooOo0 = p080o000OoO.o00.Oooo00o(6);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final String f9221OooOo0O = p080o000OoO.o00.Oooo00o(7);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final String f9222OooOo0o = p080o000OoO.o00.Oooo00o(8);

    static {
        new OooO0o(0);
    }

    public OooO(int i, int i2, OooOOO0 oooOOO0, @Nullable PendingIntent pendingIntent, o0O00 o0o01, oo00o oo00oVar, Player.OooO00o oooO00o, Player.OooO00o oooO00o2, Bundle bundle, o00O00O o00o00o2) {
        this.f9224OooO0Oo = i;
        this.f9226OooO0o0 = i2;
        this.f9225OooO0o = oooOOO0;
        this.f9228OooO0oo = oo00oVar;
        this.f9223OooO = oooO00o;
        this.f9229OooOO0 = oooO00o2;
        this.f9227OooO0oO = pendingIntent;
        this.f9230OooOO0O = bundle;
        this.f9231OooOO0o = o00o00o2;
        this.f9232OooOOO0 = o0o01;
    }

    @Override // androidx.media3.common.OooO0OO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9213OooOOO, this.f9224OooO0Oo);
        p063o0000oO.Oooo0.OooO0O0(bundle, f9214OooOOOO, this.f9225OooO0o.asBinder());
        bundle.putParcelable(f9215OooOOOo, this.f9227OooO0oO);
        ImmutableList<OooO0O0> immutableList = this.f9232OooOOO0;
        if (!immutableList.isEmpty()) {
            bundle.putParcelableArrayList(f9217OooOOo0, p080o000OoO.o00oO0o.OooO0O0(immutableList));
        }
        bundle.putBundle(f9216OooOOo, this.f9228OooO0oo.toBundle());
        Player.OooO00o oooO00o = this.f9223OooO;
        bundle.putBundle(f9218OooOOoo, oooO00o.toBundle());
        Player.OooO00o oooO00o2 = this.f9229OooOO0;
        bundle.putBundle(f9220OooOo00, oooO00o2.toBundle());
        bundle.putBundle(f9219OooOo0, this.f9230OooOO0O);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int i = 0;
        while (true) {
            androidx.media3.common.OooO oooO = oooO00o.f6703OooO0Oo;
            if (i >= oooO.OooO0OO()) {
                bundle.putBundle(f9221OooOo0O, this.f9231OooOO0o.OooO0Oo(new Player.OooO00o(new androidx.media3.common.OooO(sparseBooleanArray))));
                bundle.putInt(f9222OooOo0o, this.f9226OooO0o0);
                return bundle;
            }
            if (oooO00o2.OooO0OO(oooO.OooO0O0(i))) {
                sparseBooleanArray.append(oooO.OooO0O0(i), true);
            }
            i++;
        }
    }
}
