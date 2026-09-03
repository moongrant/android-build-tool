package p526o0o0OOO0;

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
import o000O00.OooO0OO;
import o000O00.o00000O;
import o000O00.o00000O0;
import o000O00.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nScreenRegister.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenRegister.kt\ncom/yalla/yalla/ui/screen/ScreenRegister\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n1855#2,2:165\n*S KotlinDebug\n*F\n+ 1 ScreenRegister.kt\ncom/yalla/yalla/ui/screen/ScreenRegister\n*L\n129#1:165,2\n*E\n"})
public final class o00O0OOO {
    public static void OooO00o(o00000O0 o00000o1, o00000O o00000o, o00O00O o00o00o2) {
        EnterTransition enterTransitionSlideInHorizontally = EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), o00O00OO.f53605OooO0Oo);
        ExitTransition exitTransitionSlideOutHorizontally = EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), o00O00o0.f53606OooO0Oo);
        EnterTransition enterTransitionSlideInHorizontally2 = EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 20, null, 4, null), oo00o.f53616OooO0Oo);
        ExitTransition exitTransitionSlideOutHorizontally2 = EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 20, null, 4, null), o00O0.f53596OooO0Oo);
        String strRouterName = o00o00o2.routerName();
        o00O0O00 o00o0o01 = new o00O0O00(enterTransitionSlideInHorizontally);
        o00O0O0 o00o0o0 = new o00O0O0(exitTransitionSlideOutHorizontally);
        o00O0O0O o00o0o0o2 = new o00O0O0O(enterTransitionSlideInHorizontally2);
        o00O0OO0 o00o0oo1 = new o00O0OO0(exitTransitionSlideOutHorizontally2);
        ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(1818021728, true, new o00O0OO(o00000o, o00o00o2));
        List listEmptyList = CollectionsKt.emptyList();
        List listEmptyList2 = CollectionsKt.emptyList();
        OooOOOO oooOOOO = o00000o1.f34373OooO0oO;
        oooOOOO.getClass();
        Intrinsics.checkNotNullParameter(OooO.class, "navigatorClass");
        OooO.OooO00o destination = new OooO.OooO00o((OooO) oooOOOO.OooO0O0(OooOOOO.OooO00o.OooO00o(OooO.class)), composableLambdaComposableLambdaInstance);
        destination.OooO0o(strRouterName);
        Iterator it = listEmptyList.iterator();
        if (it.hasNext()) {
            ((OooO0OO) it.next()).getClass();
            Intrinsics.checkNotNullParameter(null, "argumentName");
            Intrinsics.checkNotNullParameter(null, "argument");
            destination.f6815OooO.put(null, null);
            throw null;
        }
        Iterator it2 = listEmptyList2.iterator();
        while (it2.hasNext()) {
            destination.OooO00o((o00O0O) it2.next());
        }
        destination.f6999OooOOO = o00o0o01;
        destination.f7001OooOOOO = o00o0o0;
        destination.f7002OooOOOo = o00o0o0o2;
        destination.f7003OooOOo0 = o00o0oo1;
        Intrinsics.checkNotNullParameter(destination, "destination");
        o00000o1.f34372OooO.add(destination);
    }
}
