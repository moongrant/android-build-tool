package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import p118o00O0Oo.OooOO0;
import p118o00O0Oo.o000oOoO;
import p125o00O0o0O.o000OOo;
import p129o00O0oOo.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class MergePaths implements o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10095OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MergePathsMode f10096OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f10097OooO0OO;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f10095OooO00o = str;
        this.f10096OooO0O0 = mergePathsMode;
        this.f10097OooO0OO = z;
    }

    @Override // p125o00O0o0O.o000OOo
    @Nullable
    public final OooOO0 OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        if (lottieDrawable.f9995OoooOoO) {
            return new o000oOoO(this);
        }
        o000Oo0.OooO0OO("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MergePaths{mode=");
        sbOooO0o0.append(this.f10096OooO0O0);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
