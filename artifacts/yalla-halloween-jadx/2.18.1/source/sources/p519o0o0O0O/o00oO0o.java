package p519o0o0O0O;

import OooO00o.OooO00o;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.app.OooO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o000000;
import p254o00ooO0O.o00000O;
import p584o0oOoo.o000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return R.drawable.icon_badge_star;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return R.string.didi_kit_activity_stack;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final void onClick(@Nullable Context context) {
        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        TextView textView = new TextView(activityOooO0O0);
        textView.setGravity(17);
        float f = 20;
        textView.setPadding(0, OooOo00.OooO00o(f), 0, OooOo00.OooO00o(f));
        textView.setTextColor(-16777216);
        textView.setTextSize(15.0f);
        StringBuilder sb = new StringBuilder();
        List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.toList(o00000O.f34256OooO0OO));
        CollectionsKt.reverse(mutableList);
        int i = 0;
        for (Object obj : mutableList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Activity activity = (Activity) obj;
            if (Intrinsics.areEqual(activity.getClass().getName(), ScreenNavigationActivity.class.getName())) {
                o000O o000o = o000O.f46945OooO00o;
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.screen.ScreenNavigationActivity");
                ScreenNavigationActivity activity2 = (ScreenNavigationActivity) activity;
                Intrinsics.checkNotNullParameter(activity2, "activity");
                o000000 orDefault = o000O.f46946OooO0O0.getOrDefault(activity2, null);
                Intrinsics.checkNotNull(orDefault);
                ArrayDeque<NavBackStackEntry> arrayDeque = orDefault.f28458OooO0oO;
                for (int size = arrayDeque.size() - 1; -1 < size; size--) {
                    String strSubstring = arrayDeque.get(size).getDestination().f8634OoooO;
                    if (!TextUtils.isEmpty(strSubstring)) {
                        Intrinsics.checkNotNull(strSubstring);
                        if (StringsKt__StringsKt.contains$default(strSubstring, ".", false, 2, (Object) null)) {
                            strSubstring = strSubstring.substring(StringsKt__StringsKt.lastIndexOf$default(strSubstring, ".", 0, false, 6, (Object) null) + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        }
                        if (StringsKt__StringsKt.contains$default(strSubstring, "/", false, 2, (Object) null)) {
                            strSubstring = strSubstring.substring(0, StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring, "/", 0, false, 6, (Object) null));
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        sb.append("[ " + strSubstring + " ]\n\n ");
                    }
                }
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("( ");
                sbOooO0o0.append(activity.getClass().getSimpleName());
                sbOooO0o0.append(" )");
                sb.append(sbOooO0o0.toString());
            } else {
                sb.append(activity.getClass().getSimpleName());
            }
            if (i != mutableList.size() - 1) {
                sb.append("\n\n");
            }
            i = i2;
        }
        textView.setText(sb.toString());
        Intrinsics.checkNotNull(activityOooO0O0, "null cannot be cast to non-null type android.app.Activity");
        OooO0o.OooO00o oooO00o = new OooO0o.OooO00o(activityOooO0O0);
        oooO00o.f4518OooO00o.f4402OooO = textView;
        OooO0o oooO0oOooO00o = oooO00o.OooO00o();
        Intrinsics.checkNotNullExpressionValue(oooO0oOooO00o, "Builder(activity as Acti…etView(textView).create()");
        oooO0oOooO00o.show();
    }
}
