package p003OooO0Oo;

import OooO00o.OooOO0;
import OooO00o.OooOOO;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.yallatech.support.platform.base.BaseResp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0o0.OooO0o;
import p011OooOOoo.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public OooO0o f105OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public ArrayList<Oooo000> f106OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f107OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00O0O f108OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooOOO f109OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f110OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f111OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public OooO00o f112OooO0oo;

    public interface OooO00o {
        void OooO00o();
    }

    public interface OooO0O0 {
        void OooO00o(@NotNull BaseResp baseResp);
    }

    public OooOo00(@NotNull OooO0o fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f105OooO00o = fragment;
        this.f107OooO0OO = -1;
        OooOOO oooOOO = new OooOOO();
        this.f109OooO0o = oooOOO;
        FragmentActivity activity = OooO0o0();
        Intrinsics.checkNotNullParameter(activity, "activity");
        androidx.activity.result.OooO0O0<Intent> oooO0O0RegisterForActivityResult = activity.registerForActivityResult(new OooOOO0(), new OooOO0(oooOOO));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult, "activity.registerForActi…}\n        }\n      }\n    }");
        oooOOO.f76OooO00o = oooO0O0RegisterForActivityResult;
    }

    @NotNull
    public abstract BaseResp OooO00o(int i, @Nullable String str);

    public final void OooO0O0() {
        ArrayList<Oooo000> arrayList = this.f106OooO0O0;
        if (arrayList != null) {
            Iterator<Oooo000> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().f115OooO00o = Boolean.TRUE;
            }
        }
        this.f110OooO0o0 = true;
    }

    public final void OooO0OO(@NotNull o00O0O request) {
        Intrinsics.checkNotNullParameter(request, "request");
        o00O0O o00o0o2 = this.f108OooO0Oo;
        if (o00o0o2 != null && this.f107OooO0OO >= 0) {
            return;
        }
        this.f110OooO0o0 = false;
        if (o00o0o2 != null) {
            return;
        }
        this.f108OooO0Oo = request;
        this.f106OooO0O0 = OooO0o();
        OooO0oo();
    }

    public final void OooO0Oo(@NotNull BaseResp response) {
        OooO0O0 oooO0O0;
        Intrinsics.checkNotNullParameter(response, "response");
        this.f106OooO0O0 = null;
        this.f107OooO0OO = -1;
        this.f108OooO0Oo = null;
        if (this.f110OooO0o0 || (oooO0O0 = this.f111OooO0oO) == null) {
            return;
        }
        oooO0O0.OooO00o(response);
    }

    @NotNull
    public abstract ArrayList<Oooo000> OooO0o();

    @NotNull
    public final FragmentActivity OooO0o0() {
        FragmentActivity fragmentActivityRequireActivity = this.f105OooO00o.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
        return fragmentActivityRequireActivity;
    }

    @Nullable
    public abstract o00O0O OooO0oO();

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    public final void OooO0oo() {
        Oooo000 oooo000;
        ArrayList<Oooo000> arrayList;
        ArrayList<Oooo000> arrayList2 = this.f106OooO0O0;
        if (arrayList2 != null) {
            int i = this.f107OooO0OO;
            Intrinsics.checkNotNull(arrayList2);
            if (i < arrayList2.size() - 1) {
                int i2 = this.f107OooO0OO + 1;
                this.f107OooO0OO = i2;
                if (i2 < 0 || (arrayList = this.f106OooO0O0) == null) {
                    oooo000 = null;
                } else {
                    Intrinsics.checkNotNull(arrayList);
                    if (arrayList.size() > this.f107OooO0OO) {
                        ArrayList<Oooo000> arrayList3 = this.f106OooO0O0;
                        Intrinsics.checkNotNull(arrayList3);
                        oooo000 = arrayList3.get(this.f107OooO0OO);
                    } else {
                        oooo000 = null;
                    }
                }
                if ((oooo000 == null ? false : Intrinsics.areEqual(oooo000.f115OooO00o, Boolean.TRUE)) || oooo000 == null) {
                    return;
                }
                oooo000.OooO0o0();
            }
        }
    }
}
