package p532o0o0OOo0;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import p105o000oo0o.o00O00OO;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nScreenStackManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStackManager.kt\ncom/yalla/yalla/ui/screen/ScreenStackManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1549#2:40\n1620#2,3:41\n1855#2:44\n1855#2,2:45\n1856#2:47\n*S KotlinDebug\n*F\n+ 1 ScreenStackManager.kt\ncom/yalla/yalla/ui/screen/ScreenStackManager\n*L\n13#1:40\n13#1:41,3\n24#1:44\n26#1:45,2\n24#1:47\n*E\n"})
public final class oOO00O {
    @NotNull
    public static ArrayList OooO00o() {
        StateFlow<List<NavBackStackEntry>> stateFlow;
        List<NavBackStackEntry> value;
        ArrayList<String> arrayList = new ArrayList();
        for (Activity activity : CollectionsKt.toList(OooO0O0.f13314OooO00o)) {
            if (activity instanceof ScreenNavigationActivity) {
                OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
                ScreenNavigationActivity activity2 = (ScreenNavigationActivity) activity;
                Intrinsics.checkNotNullParameter(activity2, "activity");
                o00O00OO orDefault = o00O00.f53494OooO00o.getOrDefault(activity2, null);
                if (orDefault != null && (stateFlow = orDefault.f9938OooO) != null && (value = stateFlow.getValue()) != null) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        String str = ((NavBackStackEntry) it.next()).getDestination().f9916OooOO0O;
                        if (!(str == null || StringsKt.isBlank(str))) {
                            arrayList.add(str);
                        }
                    }
                }
            } else {
                String name = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                arrayList.add(name);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
        for (String strSubstring : arrayList) {
            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(strSubstring, ".", 0, false, 6, (Object) null);
            if (iLastIndexOf$default > 0) {
                strSubstring = strSubstring.substring(iLastIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            arrayList2.add(strSubstring);
        }
        return arrayList2;
    }
}
