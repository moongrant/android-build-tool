package p618o0oo0o0;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.PermissionChecker;
import androidx.fragment.app.FragmentActivity;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p021OooOooo.o00oO0o;
import p031OoooO.o0000O;
import p074o000O0oo.OooOOO0;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p406o0Oo0OOO.oO000;
import p406o0Oo0OOO.oO00000o;
import p406o0Oo0OOO.oO0000O;
import p406o0Oo0OOO.oO0000Oo;
import p406o0Oo0OOO.oO0000o0;
import p406o0Oo0OOO.oO000O0;
import p406o0Oo0OOO.oO000O0O;
import p406o0Oo0OOO.oO0Oo;
import p406o0Oo0OOO.oO0Ooooo;
import p565o0oOo000.OooOo;
import p694oO000oO0.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f48590OooO00o;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public FragmentActivity f48591OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public List<String> f48592OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Function1<? super List<String>, Unit> f48593OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Function1<? super List<String>, Unit> f48594OooO0Oo;

        public OooO00o(@NotNull FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f48592OooO0O0 = new ArrayList();
            this.f48591OooO00o = activity;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f48595Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Activity f48596Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oo0oOO0 f48597Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo.OooO00o f48598Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Activity activity, oo0oOO0 oo0ooo0, oo0o0Oo.OooO00o oooO00o, Function1<? super Boolean, Unit> function1) {
            super(0);
            this.f48596Oooo0o = activity;
            this.f48597Oooo0oO = oo0ooo0;
            this.f48598Oooo0oo = oooO00o;
            this.f48595Oooo = function1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Activity activity = this.f48596Oooo0o;
            if (!(activity instanceof FragmentActivity)) {
                throw new IllegalArgumentException("Need FragmentActivity");
            }
            OooO00o oooO00o = new OooO00o((FragmentActivity) activity);
            oo0o0Oo.OooO00o oooO00o2 = this.f48598Oooo0oo;
            Function1<Boolean, Unit> function1 = this.f48595Oooo;
            Activity activity2 = this.f48596Oooo0o;
            List[] groups = {oooO00o2.f48611OooO00o};
            Intrinsics.checkNotNullParameter(groups, "groups");
            for (int i = 0; i < 1; i++) {
                oooO00o.f48592OooO0O0.addAll(groups[i]);
            }
            o000OOo granted = new o000OOo(function1);
            Intrinsics.checkNotNullParameter(granted, "granted");
            oooO00o.f48593OooO0OO = granted;
            o000000 denied = new o000000(activity2, oooO00o2, function1);
            Intrinsics.checkNotNullParameter(denied, "denied");
            oooO00o.f48594OooO0Oo = denied;
            if (!o0O0O00.f48590OooO00o && !oooO00o.f48592OooO0O0.isEmpty()) {
                FragmentActivity activity3 = oooO00o.f48591OooO00o;
                if (activity3 == null) {
                    Intrinsics.checkNotNullParameter(null, "fragment");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(activity3, "activity");
                List<String> permissions = oooO00o.f48592OooO0O0;
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int i2 = Build.VERSION.SDK_INT;
                Intrinsics.checkNotNull(activity3);
                int i3 = activity3.getApplicationInfo().targetSdkVersion;
                for (String str : permissions) {
                    if (OooOo.f45176OooO00o.contains(str)) {
                        linkedHashSet2.add(str);
                    } else {
                        linkedHashSet.add(str);
                    }
                }
                if (linkedHashSet2.contains("android.permission.ACCESS_BACKGROUND_LOCATION") && (i2 == 29 || (i2 == 30 && i3 < 30))) {
                    linkedHashSet2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                    linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
                oO00000o oo00000o = new oO00000o(activity3, null, linkedHashSet, linkedHashSet2);
                oo00000o.f39124OooOO0o = new OooOOO0(oooO00o);
                oo00000o.f39116OooO0OO = oo00000o.OooO00o().getRequestedOrientation();
                int i4 = oo00000o.OooO00o().getResources().getConfiguration().orientation;
                if (i4 == 1) {
                    oo00000o.OooO00o().setRequestedOrientation(7);
                } else if (i4 == 2) {
                    oo00000o.OooO00o().setRequestedOrientation(6);
                }
                oO0000Oo oo0000oo = new oO0000Oo();
                oo0000oo.OooO00o(new oO000O0(oo00000o));
                oo0000oo.OooO00o(new oO0000O(oo00000o));
                oo0000oo.OooO00o(new oO000O0O(oo00000o));
                oo0000oo.OooO00o(new oO0Ooooo(oo00000o));
                oo0000oo.OooO00o(new oO000(oo00000o));
                oo0000oo.OooO00o(new oO0000o0(oo00000o));
                oO0Oo oo0oo = oo0000oo.f39125OooO00o;
                if (oo0oo != null) {
                    oo0oo.OooO00o();
                }
            }
            this.f48597Oooo0oO.OooO0Oo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f48599Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oo0oOO0 f48600Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Function0<Unit> function0, oo0oOO0 oo0ooo0) {
            super(0);
            this.f48599Oooo0o = function0;
            this.f48600Oooo0oO = oo0ooo0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f48599Oooo0o;
            if (function0 != null) {
                function0.invoke();
            }
            this.f48600Oooo0oO.OooO0Oo();
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final boolean OooO00o(@NotNull Context context, @NotNull List<String> permissions) {
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
            o00oO0o<String, Integer> o00oo0o2 = OooO0o.f52713OooO00o;
            for (String str : strArr) {
                Integer orDefault = OooO0o.f52713OooO00o.getOrDefault(str, null);
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
    public static final boolean OooO0O0(@NotNull Context context, @NotNull oo0o0Oo.OooO00o revealGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(revealGroup, "revealGroup");
        return OooO00o(context, revealGroup.f48611OooO00o);
    }

    @JvmStatic
    public static final void OooO0OO(@NotNull Activity activity, @NotNull oo0o0Oo.OooO00o groupType, @Nullable Function0<Unit> function0, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        if (OooO00o(activity, groupType.f48611OooO00o)) {
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(contextOooO0O0);
        oo0ooo0.OooOoo(groupType.f48612OooO0O0);
        oo0ooo0.OooOo0(groupType.f48613OooO0OO);
        oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.permission_button_allow));
        oo0ooo0.OooOo0o(new OooO0O0(activity, oo0ooo0, groupType, function1));
        oo0ooo0.OooOoO0(o000O0O0.OooO0OO(R.string.permission_button_allow_do_not));
        oo0ooo0.OooOo(new OooO0OO(function0, oo0ooo0));
        oo0ooo0.OooOOO0();
    }
}
