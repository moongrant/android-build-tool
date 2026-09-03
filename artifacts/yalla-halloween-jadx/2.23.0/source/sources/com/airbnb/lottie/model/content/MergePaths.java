package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import o00O0.OooOO0;
import o00O000.OooO0OO;
import o00O000.OooOo;
import p113o00O00Oo.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class MergePaths implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MergePathsMode f8776OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f8777OooO0O0;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f8776OooO00o = mergePathsMode;
        this.f8777OooO0O0 = z;
    }

    @Override // p113o00O00Oo.o00O0O
    @Nullable
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        if (lottieDrawable.f8681OooOOOO) {
            return new OooOo(this);
        }
        OooOO0.OooO0O0("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f8776OooO00o + '}';
    }
}
