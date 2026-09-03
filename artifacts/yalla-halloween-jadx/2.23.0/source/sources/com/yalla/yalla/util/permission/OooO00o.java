package com.yalla.yalla.util.permission;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.PermissionChecker;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o000O0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p188o00o0O.Oooo000;
import p331o0OO0o0.o0000;
import p331o0OO0o0.o00000;
import p331o0OO0o0.o000000;
import p331o0OO0o0.o000000O;
import p331o0OO0o0.o00000O;
import p331o0OO0o0.o00000O0;
import p331o0OO0o0.o00000OO;
import p331o0OO0o0.o0000Ooo;
import p331o0OO0o0.o0O0O00;
import p331o0OO0o0.o0OOO0o;
import p584o0oOooO0.oO00OOo0;
import p666o0oooOo0.oO00o00O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nYlPermission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YlPermission.kt\ncom/yalla/yalla/util/permission/YlPermission\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,166:1\n1855#2,2:167\n*S KotlinDebug\n*F\n+ 1 YlPermission.kt\ncom/yalla/yalla/util/permission/YlPermission\n*L\n110#1:167,2\n*E\n"})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f32864OooO00o;

    /* JADX INFO: renamed from: com.yalla.yalla.util.permission.OooO00o$OooO00o, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    public static final class C0376OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final FragmentActivity f32865OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ArrayList f32866OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Function1<? super List<String>, Unit> f32867OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Function1<? super List<String>, Unit> f32868OooO0Oo;

        public C0376OooO00o(@NotNull FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f32866OooO0O0 = new ArrayList();
            this.f32865OooO00o = activity;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Activity f32869OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PermissionGroupReveal.RevealGroupType f32870OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f32871OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f32872OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Activity activity, o0OO00O o0oo00o2, PermissionGroupReveal.RevealGroupType revealGroupType, Function1<? super Boolean, Unit> function1) {
            super(0);
            this.f32869OooO0Oo = activity;
            this.f32871OooO0o0 = o0oo00o2;
            this.f32870OooO0o = revealGroupType;
            this.f32872OooO0oO = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Activity activity = this.f32869OooO0Oo;
            if (!(activity instanceof FragmentActivity)) {
                throw new IllegalArgumentException("Need FragmentActivity");
            }
            C0376OooO00o c0376OooO00o = new C0376OooO00o((FragmentActivity) activity);
            PermissionGroupReveal.RevealGroupType revealGroupType = this.f32870OooO0o;
            List[] groups = {revealGroupType.f32886OooO0Oo};
            Intrinsics.checkNotNullParameter(groups, "groups");
            List list = groups[0];
            ArrayList<String> permissions = c0376OooO00o.f32866OooO0O0;
            permissions.addAll(list);
            Function1<Boolean, Unit> function1 = this.f32872OooO0oO;
            com.yalla.yalla.util.permission.OooO0O0 granted = new com.yalla.yalla.util.permission.OooO0O0(function1);
            Intrinsics.checkNotNullParameter(granted, "granted");
            c0376OooO00o.f32867OooO0OO = granted;
            com.yalla.yalla.util.permission.OooO0OO denied = new com.yalla.yalla.util.permission.OooO0OO(activity, revealGroupType, function1);
            Intrinsics.checkNotNullParameter(denied, "denied");
            c0376OooO00o.f32868OooO0Oo = denied;
            if (!OooO00o.f32864OooO00o && !permissions.isEmpty()) {
                FragmentActivity activity2 = c0376OooO00o.f32865OooO00o;
                if (activity2 == null) {
                    Intrinsics.checkNotNullParameter(null, "fragment");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(activity2, "activity");
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int i = Build.VERSION.SDK_INT;
                Intrinsics.checkNotNull(activity2);
                int i2 = activity2.getApplicationInfo().targetSdkVersion;
                for (String str : permissions) {
                    if (o0OO0o00.OooO00o.f43194OooO00o.contains(str)) {
                        linkedHashSet2.add(str);
                    } else {
                        linkedHashSet.add(str);
                    }
                }
                if (linkedHashSet2.contains("android.permission.ACCESS_BACKGROUND_LOCATION") && (i == 29 || (i == 30 && i2 < 30))) {
                    linkedHashSet2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                    linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
                o000000 o000000Var = new o000000(activity2, null, linkedHashSet, linkedHashSet2);
                o000000Var.f43178OooOO0O = new o0O0O00(c0376OooO00o);
                o000000Var.f43171OooO0OO = o000000Var.OooO00o().getRequestedOrientation();
                int i3 = o000000Var.OooO00o().getResources().getConfiguration().orientation;
                if (i3 == 1) {
                    o000000Var.OooO00o().setRequestedOrientation(7);
                } else if (i3 == 2) {
                    o000000Var.OooO00o().setRequestedOrientation(6);
                }
                o00000 o00000Var = new o00000();
                o00000Var.OooO00o(new o00000OO(o000000Var));
                o00000Var.OooO00o(new o000000O(o000000Var));
                o00000Var.OooO00o(new o0000Ooo(o000000Var));
                o00000Var.OooO00o(new o0000(o000000Var));
                o00000Var.OooO00o(new o00000O(o000000Var));
                o00000Var.OooO00o(new o00000O0(o000000Var));
                o0OOO0o o0ooo0o2 = o00000Var.f43166OooO00o;
                if (o0ooo0o2 != null) {
                    o0ooo0o2.OooO00o();
                }
            }
            this.f32871OooO0o0.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f32873OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f32874OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Function0<Unit> function0, o0OO00O o0oo00o2) {
            super(0);
            this.f32873OooO0Oo = function0;
            this.f32874OooO0o0 = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f32873OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            this.f32874OooO0o0.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final boolean OooO00o(@NotNull Context context, @NotNull PermissionGroupReveal.RevealGroupType revealGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(revealGroup, "revealGroup");
        return OooO0O0(context, revealGroup.f32886OooO0Oo);
    }

    @JvmStatic
    public static final boolean OooO0O0(@NotNull Context context, @NotNull List<String> permissions) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Iterator<T> it = permissions.iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                return true;
            }
            String[] permissions2 = {(String) it.next()};
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permissions2, "permissions");
            String[] strArr = (String[]) Arrays.copyOf(permissions2, 1);
            Oooo000<String, Integer> oooo000 = oO00o00O.f60333OooO00o;
            for (String str : strArr) {
                Integer orDefault = oO00o00O.f60333OooO00o.getOrDefault(str, null);
                if (orDefault == null || Build.VERSION.SDK_INT >= orDefault.intValue()) {
                    try {
                        z2 = PermissionChecker.OooO00o(context, str) == 0;
                    } catch (RuntimeException unused) {
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                }
            }
        } while (z);
        return false;
    }

    @JvmStatic
    public static final void OooO0OO(@NotNull Activity activity, @NotNull PermissionGroupReveal.RevealGroupType groupType, @Nullable Function0<Unit> function0, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        if (OooO0O0(activity, groupType.f32886OooO0Oo)) {
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O0);
            o0oo00o2.OooOoO0(groupType.f32888OooO0o0);
            o0oo00o2.OooOOoo(groupType.f32887OooO0o);
            o0oo00o2.OooOOOo(com.code.android.util.o0000.OooO0OO(oO00OOo0.permission_button_allow));
            o0oo00o2.OooOo0(new OooO0O0(activity, o0oo00o2, groupType, function1));
            o0oo00o2.OooOo0o(com.code.android.util.o0000.OooO0OO(oO00OOo0.permission_button_allow_do_not));
            o0oo00o2.OooOo0O(new OooO0OO(function0, o0oo00o2));
            o0oo00o2.OooOO0o();
        }
    }
}
