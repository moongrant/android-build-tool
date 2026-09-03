package p003OooO0o0;

import OooO0O0.OooO;
import OooO0O0.OooOOO0;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.yallatech.support.platform.base.BaseResp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011OooOo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0o.OooO00o f127OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public ArrayList<oo000o> f128OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f129OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0Oo0oo f130OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f131OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f132OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f133OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public OooO00o f134OooO0oo;

    public interface OooO00o {
        void OooO00o();
    }

    public interface OooO0O0 {
        void OooO00o(@NotNull BaseResp baseResp);
    }

    public o00Oo0(@NotNull OooO0o.OooO00o fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f127OooO00o = fragment;
        this.f129OooO0OO = -1;
        OooOOO0 oooOOO0 = new OooOOO0();
        this.f131OooO0o = oooOOO0;
        FragmentActivity activity = OooO0o0();
        Intrinsics.checkNotNullParameter(activity, "activity");
        androidx.activity.result.OooO0O0<Intent> oooO0O0RegisterForActivityResult = activity.registerForActivityResult(new OooOOO(), new OooO(oooOOO0));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult, "activity.registerForActi…}\n        }\n      }\n    }");
        oooOOO0.f103OooO00o = oooO0O0RegisterForActivityResult;
    }

    @NotNull
    public abstract BaseResp OooO00o(int i, @Nullable String str);

    public final void OooO0O0() {
        ArrayList<oo000o> arrayList = this.f128OooO0O0;
        if (arrayList != null) {
            Iterator<oo000o> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().f146OooO00o = Boolean.TRUE;
            }
        }
        this.f132OooO0o0 = true;
    }

    public final void OooO0OO(@NotNull o0Oo0oo request) {
        Intrinsics.checkNotNullParameter(request, "request");
        o0Oo0oo o0oo0oo2 = this.f130OooO0Oo;
        if (o0oo0oo2 != null && this.f129OooO0OO >= 0) {
            return;
        }
        this.f132OooO0o0 = false;
        if (o0oo0oo2 != null) {
            return;
        }
        this.f130OooO0Oo = request;
        this.f128OooO0O0 = OooO0o();
        OooO0oo();
    }

    public final void OooO0Oo(@NotNull BaseResp response) {
        OooO0O0 oooO0O0;
        Intrinsics.checkNotNullParameter(response, "response");
        this.f128OooO0O0 = null;
        this.f129OooO0OO = -1;
        this.f130OooO0Oo = null;
        if (this.f132OooO0o0 || (oooO0O0 = this.f133OooO0oO) == null) {
            return;
        }
        oooO0O0.OooO00o(response);
    }

    @NotNull
    public abstract ArrayList<oo000o> OooO0o();

    @NotNull
    public final FragmentActivity OooO0o0() {
        FragmentActivity fragmentActivityRequireActivity = this.f127OooO00o.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
        return fragmentActivityRequireActivity;
    }

    @Nullable
    public abstract o0Oo0oo OooO0oO();

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    public final void OooO0oo() {
        oo000o oo000oVar;
        ArrayList<oo000o> arrayList;
        ArrayList<oo000o> arrayList2 = this.f128OooO0O0;
        if (arrayList2 != null) {
            int i = this.f129OooO0OO;
            Intrinsics.checkNotNull(arrayList2);
            if (i < arrayList2.size() - 1) {
                int i2 = this.f129OooO0OO + 1;
                this.f129OooO0OO = i2;
                if (i2 < 0 || (arrayList = this.f128OooO0O0) == null) {
                    oo000oVar = null;
                } else {
                    Intrinsics.checkNotNull(arrayList);
                    if (arrayList.size() > this.f129OooO0OO) {
                        ArrayList<oo000o> arrayList3 = this.f128OooO0O0;
                        Intrinsics.checkNotNull(arrayList3);
                        oo000oVar = arrayList3.get(this.f129OooO0OO);
                    } else {
                        oo000oVar = null;
                    }
                }
                if ((oo000oVar == null ? false : Intrinsics.areEqual(oo000oVar.f146OooO00o, Boolean.TRUE)) || oo000oVar == null) {
                    return;
                }
                oo000oVar.OooO0o0();
            }
        }
    }
}
