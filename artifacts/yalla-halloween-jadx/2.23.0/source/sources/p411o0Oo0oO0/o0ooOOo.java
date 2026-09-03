package p411o0Oo0oO0;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000O0;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.StateFlow;
import o000O00.o00000O;
import org.jetbrains.annotations.Nullable;
import p188o00o0O.OooOO0;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nActivityStackKit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityStackKit.kt\ncom/yalla/yalla/developer/ActivityStackKit\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1864#2,3:80\n*S KotlinDebug\n*F\n+ 1 ActivityStackKit.kt\ncom/yalla/yalla/developer/ActivityStackKit\n*L\n42#1:80,3\n*E\n"})
public final class o0ooOOo extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return oOo00OO0.icon_badge_star;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return oO00OOo0.didi_kit_activity_stack;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final void onClick(@Nullable Context context) {
        List<NavBackStackEntry> listEmptyList;
        StateFlow<List<NavBackStackEntry>> stateFlow;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 == null) {
            return;
        }
        TextView textView = new TextView(activityOooO0O0);
        textView.setGravity(17);
        float f = 20;
        textView.setPadding(0, o0000O0.OooO00o(f), 0, o0000O0.OooO00o(f));
        textView.setTextColor(-16777216);
        textView.setTextSize(15.0f);
        StringBuilder sb = new StringBuilder();
        List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.toList(OooO0O0.f10254OooO00o));
        CollectionsKt.reverse(mutableList);
        int i = 0;
        for (Object obj : mutableList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Activity activity = (Activity) obj;
            if (activity instanceof ScreenNavigationActivity) {
                OooOO0<Activity, o00000O> oooOO1 = oo0oOO0.f53618OooO00o;
                ScreenNavigationActivity activity2 = (ScreenNavigationActivity) activity;
                Intrinsics.checkNotNullParameter(activity2, "activity");
                o00000O orDefault = oo0oOO0.f53618OooO00o.getOrDefault(activity2, null);
                if (orDefault == null || (stateFlow = orDefault.f6844OooO) == null || (listEmptyList = stateFlow.getValue()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                for (int size = listEmptyList.size() - 1; -1 < size; size--) {
                    String strSubstring = listEmptyList.get(size).getDestination().f6822OooOO0O;
                    if (!TextUtils.isEmpty(strSubstring)) {
                        Intrinsics.checkNotNull(strSubstring);
                        if (StringsKt.OooO0o(strSubstring, ".")) {
                            strSubstring = strSubstring.substring(StringsKt__StringsKt.lastIndexOf$default(strSubstring, ".", 0, false, 6, (Object) null) + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        }
                        if (StringsKt.OooO0o(strSubstring, "/")) {
                            strSubstring = strSubstring.substring(0, StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring, "/", 0, false, 6, (Object) null));
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        sb.append("[ " + strSubstring + " ]\n\n ");
                    }
                }
                sb.append("( " + activityOooO0O0.getClass().getSimpleName() + " )");
            } else {
                sb.append(activityOooO0O0.getClass().getSimpleName());
            }
            if (i != mutableList.size() - 1) {
                sb.append("\n\n");
            }
            i = i2;
        }
        textView.setText(sb.toString());
        androidx.appcompat.app.OooO0O0 oooO0O0Create = new androidx.appcompat.app.OooO0O0.OooO00o(activityOooO0O0).setView(textView).create();
        Intrinsics.checkNotNullExpressionValue(oooO0O0Create, "Builder(activity).setView(textView).create()");
        oooO0O0Create.show();
    }
}
