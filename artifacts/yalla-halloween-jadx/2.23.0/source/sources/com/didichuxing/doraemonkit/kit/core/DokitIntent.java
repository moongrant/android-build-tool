package com.didichuxing.doraemonkit.kit.core;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0011\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003JE\u0010'\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006."}, d2 = {"Lcom/didichuxing/doraemonkit/kit/core/DokitIntent;", "", "targetClass", "Ljava/lang/Class;", "Lcom/didichuxing/doraemonkit/kit/core/AbsDokitView;", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", ViewHierarchyConstants.TAG_KEY, "", "mode", "Lcom/didichuxing/doraemonkit/kit/core/DoKitViewLaunchMode;", "(Ljava/lang/Class;Landroid/app/Activity;Landroid/os/Bundle;Ljava/lang/String;Lcom/didichuxing/doraemonkit/kit/core/DoKitViewLaunchMode;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "getMode", "()Lcom/didichuxing/doraemonkit/kit/core/DoKitViewLaunchMode;", "setMode", "(Lcom/didichuxing/doraemonkit/kit/core/DoKitViewLaunchMode;)V", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "getTargetClass", "()Ljava/lang/Class;", "setTargetClass", "(Ljava/lang/Class;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class DokitIntent {

    @NotNull
    private Activity activity;

    @Nullable
    private Bundle bundle;

    @NotNull
    private DoKitViewLaunchMode mode;

    @NotNull
    private String tag;

    @NotNull
    private Class<? extends AbsDokitView> targetClass;

    public DokitIntent(@NotNull Class<? extends AbsDokitView> targetClass, @NotNull Activity activity, @Nullable Bundle bundle, @NotNull String tag, @NotNull DoKitViewLaunchMode mode) {
        Intrinsics.checkNotNullParameter(targetClass, "targetClass");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.targetClass = targetClass;
        this.activity = activity;
        this.bundle = bundle;
        this.tag = tag;
        this.mode = mode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DokitIntent copy$default(DokitIntent dokitIntent, Class cls, Activity activity, Bundle bundle, String str, DoKitViewLaunchMode doKitViewLaunchMode, int i, Object obj) {
        if ((i & 1) != 0) {
            cls = dokitIntent.targetClass;
        }
        if ((i & 2) != 0) {
            activity = dokitIntent.activity;
        }
        Activity activity2 = activity;
        if ((i & 4) != 0) {
            bundle = dokitIntent.bundle;
        }
        Bundle bundle2 = bundle;
        if ((i & 8) != 0) {
            str = dokitIntent.tag;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            doKitViewLaunchMode = dokitIntent.mode;
        }
        return dokitIntent.copy(cls, activity2, bundle2, str2, doKitViewLaunchMode);
    }

    @NotNull
    public final Class<? extends AbsDokitView> component1() {
        return this.targetClass;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Activity getActivity() {
        return this.activity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Bundle getBundle() {
        return this.bundle;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DoKitViewLaunchMode getMode() {
        return this.mode;
    }

    @NotNull
    public final DokitIntent copy(@NotNull Class<? extends AbsDokitView> targetClass, @NotNull Activity activity, @Nullable Bundle bundle, @NotNull String tag, @NotNull DoKitViewLaunchMode mode) {
        Intrinsics.checkNotNullParameter(targetClass, "targetClass");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new DokitIntent(targetClass, activity, bundle, tag, mode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DokitIntent)) {
            return false;
        }
        DokitIntent dokitIntent = (DokitIntent) other;
        return Intrinsics.areEqual(this.targetClass, dokitIntent.targetClass) && Intrinsics.areEqual(this.activity, dokitIntent.activity) && Intrinsics.areEqual(this.bundle, dokitIntent.bundle) && Intrinsics.areEqual(this.tag, dokitIntent.tag) && Intrinsics.areEqual(this.mode, dokitIntent.mode);
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @Nullable
    public final Bundle getBundle() {
        return this.bundle;
    }

    @NotNull
    public final DoKitViewLaunchMode getMode() {
        return this.mode;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final Class<? extends AbsDokitView> getTargetClass() {
        return this.targetClass;
    }

    public int hashCode() {
        Class<? extends AbsDokitView> cls = this.targetClass;
        int iHashCode = (cls != null ? cls.hashCode() : 0) * 31;
        Activity activity = this.activity;
        int iHashCode2 = (iHashCode + (activity != null ? activity.hashCode() : 0)) * 31;
        Bundle bundle = this.bundle;
        int iHashCode3 = (iHashCode2 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        String str = this.tag;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        DoKitViewLaunchMode doKitViewLaunchMode = this.mode;
        return iHashCode4 + (doKitViewLaunchMode != null ? doKitViewLaunchMode.hashCode() : 0);
    }

    public final void setActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<set-?>");
        this.activity = activity;
    }

    public final void setBundle(@Nullable Bundle bundle) {
        this.bundle = bundle;
    }

    public final void setMode(@NotNull DoKitViewLaunchMode doKitViewLaunchMode) {
        Intrinsics.checkNotNullParameter(doKitViewLaunchMode, "<set-?>");
        this.mode = doKitViewLaunchMode;
    }

    public final void setTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }

    public final void setTargetClass(@NotNull Class<? extends AbsDokitView> cls) {
        Intrinsics.checkNotNullParameter(cls, "<set-?>");
        this.targetClass = cls;
    }

    @NotNull
    public String toString() {
        return "DokitIntent(targetClass=" + this.targetClass + ", activity=" + this.activity + ", bundle=" + this.bundle + ", tag=" + this.tag + ", mode=" + this.mode + ")";
    }

    public /* synthetic */ DokitIntent(Class cls, Activity activity, Bundle bundle, String str, DoKitViewLaunchMode doKitViewLaunchMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, (i & 2) != 0 ? new Activity() : activity, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? DoKitViewLaunchMode.SINGLE_INSTANCE : doKitViewLaunchMode);
    }
}
