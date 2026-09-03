package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import o00OO0.OooO0OO;
import o00OO0.OooOo;
import o00OOO0.OooOO0;
import p136o00OO0oO.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class MergePaths implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MergePathsMode f11866OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f11867OooO0O0;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f11866OooO00o = mergePathsMode;
        this.f11867OooO0O0 = z;
    }

    @Override // p136o00OO0oO.OooO
    @Nullable
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        if (lottieDrawable.f11771OooOOOO) {
            return new OooOo(this);
        }
        OooOO0.OooO0O0("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f11866OooO00o + '}';
    }
}
