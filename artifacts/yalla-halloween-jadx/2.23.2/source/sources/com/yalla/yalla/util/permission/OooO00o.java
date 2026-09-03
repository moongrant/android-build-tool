package com.yalla.yalla.util.permission;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.PermissionChecker;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p022Oooo00O.o000oOoO;
import p190o00o0O.OooOo;
import p205o00o0o0o.o000O;
import p334o0OO0o0.OooOO0;
import p335o0OO0o0O.o00000;
import p335o0OO0o0O.o000000;
import p335o0OO0o0O.o000000O;
import p335o0OO0o0O.o00000O;
import p335o0OO0o0O.o00000O0;
import p335o0OO0o0O.o000OOo;
import p335o0OO0o0O.o00oO0o;
import p335o0OO0o0O.o0O0O00;
import p335o0OO0o0O.oo0o0Oo;
import p671o0oooo00.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nYlPermission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YlPermission.kt\ncom/yalla/yalla/util/permission/YlPermission\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,166:1\n1855#2,2:167\n*S KotlinDebug\n*F\n+ 1 YlPermission.kt\ncom/yalla/yalla/util/permission/YlPermission\n*L\n110#1:167,2\n*E\n"})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f32320OooO00o;

    /* JADX INFO: renamed from: com.yalla.yalla.util.permission.OooO00o$OooO00o, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    public static final class C0375OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final FragmentActivity f32321OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ArrayList f32322OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Function1<? super List<String>, Unit> f32323OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Function1<? super List<String>, Unit> f32324OooO0Oo;

        public C0375OooO00o(@NotNull FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f32322OooO0O0 = new ArrayList();
            this.f32321OooO00o = activity;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Activity f32325OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PermissionGroupReveal.RevealGroupType f32326OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000O f32327OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f32328OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Activity activity, o000O o000o, PermissionGroupReveal.RevealGroupType revealGroupType, Function1<? super Boolean, Unit> function1) {
            super(0);
            this.f32325OooO0Oo = activity;
            this.f32327OooO0o0 = o000o;
            this.f32326OooO0o = revealGroupType;
            this.f32328OooO0oO = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Activity activity = this.f32325OooO0Oo;
            if (!(activity instanceof FragmentActivity)) {
                throw new IllegalArgumentException("Need FragmentActivity");
            }
            C0375OooO00o c0375OooO00o = new C0375OooO00o((FragmentActivity) activity);
            PermissionGroupReveal.RevealGroupType revealGroupType = this.f32326OooO0o;
            List[] groups = {revealGroupType.f32342OooO0Oo};
            Intrinsics.checkNotNullParameter(groups, "groups");
            List list = groups[0];
            ArrayList<String> permissions = c0375OooO00o.f32322OooO0O0;
            permissions.addAll(list);
            Function1<Boolean, Unit> function1 = this.f32328OooO0oO;
            com.yalla.yalla.util.permission.OooO0O0 granted = new com.yalla.yalla.util.permission.OooO0O0(function1);
            Intrinsics.checkNotNullParameter(granted, "granted");
            c0375OooO00o.f32323OooO0OO = granted;
            com.yalla.yalla.util.permission.OooO0OO denied = new com.yalla.yalla.util.permission.OooO0OO(activity, revealGroupType, function1);
            Intrinsics.checkNotNullParameter(denied, "denied");
            c0375OooO00o.f32324OooO0Oo = denied;
            if (!OooO00o.f32320OooO00o && !permissions.isEmpty()) {
                FragmentActivity activity2 = c0375OooO00o.f32321OooO00o;
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
                    if (OooOO0.f42455OooO00o.contains(str)) {
                        linkedHashSet2.add(str);
                    } else {
                        linkedHashSet.add(str);
                    }
                }
                if (linkedHashSet2.contains("android.permission.ACCESS_BACKGROUND_LOCATION") && (i == 29 || (i == 30 && i2 < 30))) {
                    linkedHashSet2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                    linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
                oo0o0Oo oo0o0oo = new oo0o0Oo(activity2, null, linkedHashSet, linkedHashSet2);
                oo0o0oo.f42495OooOO0O = new o000oOoO(c0375OooO00o);
                oo0o0oo.f42488OooO0OO = oo0o0oo.OooO00o().getRequestedOrientation();
                int i3 = oo0o0oo.OooO00o().getResources().getConfiguration().orientation;
                if (i3 == 1) {
                    oo0o0oo.OooO00o().setRequestedOrientation(7);
                } else if (i3 == 2) {
                    oo0o0oo.OooO00o().setRequestedOrientation(6);
                }
                o000OOo o000ooo2 = new o000OOo();
                o000ooo2.OooO00o(new o00000(oo0o0oo));
                o000ooo2.OooO00o(new o0O0O00(oo0o0oo));
                o000ooo2.OooO00o(new o00000O0(oo0o0oo));
                o000ooo2.OooO00o(new o00000O(oo0o0oo));
                o000ooo2.OooO00o(new o000000O(oo0o0oo));
                o000ooo2.OooO00o(new o000000(oo0o0oo));
                o00oO0o o00oo0o2 = o000ooo2.f42470OooO00o;
                if (o00oo0o2 != null) {
                    o00oo0o2.OooO00o();
                }
            }
            this.f32327OooO0o0.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f32329OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000O f32330OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Function0<Unit> function0, o000O o000o) {
            super(0);
            this.f32329OooO0Oo = function0;
            this.f32330OooO0o0 = o000o;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f32329OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            this.f32330OooO0o0.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final boolean OooO00o(@NotNull Context context, @NotNull PermissionGroupReveal.RevealGroupType revealGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(revealGroup, "revealGroup");
        return OooO0O0(context, revealGroup.f32342OooO0Oo);
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
            OooOo<String, Integer> oooOo = o0000OO0.f59914OooO00o;
            for (String str : strArr) {
                Integer orDefault = o0000OO0.f59914OooO00o.getOrDefault(str, null);
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
        if (OooO0O0(activity, groupType.f32342OooO0Oo)) {
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            o000O o000o = new o000O(activityOooO0O0);
            o000o.OooOoO0(groupType.f32344OooO0o0);
            o000o.OooOOoo(groupType.f32343OooO0o);
            o000o.OooOOOo(o0000.OooO0OO(p562o0oOo000.o000000.permission_button_allow));
            o000o.OooOo0(new OooO0O0(activity, o000o, groupType, function1));
            o000o.OooOo0o(o0000.OooO0OO(p562o0oOo000.o000000.permission_button_allow_do_not));
            o000o.OooOo0O(new OooO0OO(function0, o000o));
            o000o.OooOO0o();
        }
    }
}
