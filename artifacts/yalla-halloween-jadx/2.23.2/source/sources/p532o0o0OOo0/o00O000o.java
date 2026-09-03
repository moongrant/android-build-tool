package p532o0o0OOo0;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.OooOOOO;
import androidx.navigation.compose.OooO;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p105o000oo0o.o0000O00;
import p105o000oo0o.o000O0Oo;
import p105o000oo0o.o00O00OO;
import p105o000oo0o.oOO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nScreenRegister.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenRegister.kt\ncom/yalla/yalla/ui/screen/ScreenRegister\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n1855#2,2:165\n*S KotlinDebug\n*F\n+ 1 ScreenRegister.kt\ncom/yalla/yalla/ui/screen/ScreenRegister\n*L\n129#1:165,2\n*E\n"})
public final class o00O000o {
    public static void OooO00o(oOO00O ooo00o, o00O00OO o00o00oo2, o000O0 o000o0) {
        EnterTransition enterTransitionSlideInHorizontally = EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), o000OO0O.f53490OooO0Oo);
        ExitTransition exitTransitionSlideOutHorizontally = EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), o000O0O0.f53486OooO0Oo);
        EnterTransition enterTransitionSlideInHorizontally2 = EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 20, null, 4, null), o000O.f53479OooO0Oo);
        ExitTransition exitTransitionSlideOutHorizontally2 = EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 20, null, 4, null), o000OO00.f53489OooO0Oo);
        String strRouterName = o000o0.routerName();
        o000OOo0 o000ooo1 = new o000OOo0(enterTransitionSlideInHorizontally);
        o00 o00Var = new o00(exitTransitionSlideOutHorizontally);
        o00O0000 o00o0001 = new o00O0000(enterTransitionSlideInHorizontally2);
        o0O0ooO o0o0ooo = new o0O0ooO(exitTransitionSlideOutHorizontally2);
        ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(1818021728, true, new o00O000(o00o00oo2, o000o0));
        List listEmptyList = CollectionsKt.emptyList();
        List listEmptyList2 = CollectionsKt.emptyList();
        OooOOOO oooOOOO = ooo00o.f35772OooO0oO;
        oooOOOO.getClass();
        Intrinsics.checkNotNullParameter(OooO.class, "navigatorClass");
        OooO.OooO00o destination = new OooO.OooO00o((OooO) oooOOOO.OooO0O0(OooOOOO.OooO00o.OooO00o(OooO.class)), composableLambdaComposableLambdaInstance);
        destination.OooO0o(strRouterName);
        Iterator it = listEmptyList.iterator();
        if (it.hasNext()) {
            ((o0000O00) it.next()).getClass();
            Intrinsics.checkNotNullParameter(null, "argumentName");
            Intrinsics.checkNotNullParameter(null, "argument");
            destination.f9909OooO.put(null, null);
            throw null;
        }
        Iterator it2 = listEmptyList2.iterator();
        while (it2.hasNext()) {
            destination.OooO00o((o000O0Oo) it2.next());
        }
        destination.f10093OooOOO = o000ooo1;
        destination.f10095OooOOOO = o00Var;
        destination.f10096OooOOOo = o00o0001;
        destination.f10097OooOOo0 = o0o0ooo;
        Intrinsics.checkNotNullParameter(destination, "destination");
        ooo00o.f35771OooO.add(destination);
    }
}
