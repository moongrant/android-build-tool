package p496o0o00o;

import com.yalla.yalla.model.user.UserDefaultHeadListModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import com.yalla.yalla.ui.adapter.o00O00O;
import com.yalla.yalla.ui.adapter.oOO00O;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserDefaultHeadActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDefaultHeadActivity.kt\ncom/yalla/yalla/ui/activity/user/UserDefaultHeadActivity$loadData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1855#2:186\n1855#2,2:187\n1856#2:189\n1864#2,3:190\n*S KotlinDebug\n*F\n+ 1 UserDefaultHeadActivity.kt\ncom/yalla/yalla/ui/activity/user/UserDefaultHeadActivity$loadData$1\n*L\n134#1:186\n139#1:187,2\n134#1:189\n146#1:190,3\n*E\n"})
public final class o0O00000 extends Lambda implements Function1<List<UserDefaultHeadListModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserDefaultHeadActivity f49058OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00000(UserDefaultHeadActivity userDefaultHeadActivity) {
        super(1);
        this.f49058OooO0Oo = userDefaultHeadActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserDefaultHeadListModel> list) {
        List<UserDefaultHeadListModel> list2 = list;
        UserDefaultHeadActivity userDefaultHeadActivity = this.f49058OooO0Oo;
        if (list2 != null) {
            for (UserDefaultHeadListModel userDefaultHeadListModel : list2) {
                ArrayList arrayList = userDefaultHeadActivity.f27221OooOo0o;
                oOO00O ooo00o = new oOO00O(1);
                ooo00o.f27690OooO0OO = userDefaultHeadListModel.getName();
                ooo00o.f27691OooO0Oo = 4;
                arrayList.add(ooo00o);
                List<UserDefaultHeadListModel.UserDefaultHeadItemModel> mItems = userDefaultHeadListModel.getMItems();
                if (mItems != null) {
                    for (UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel : mItems) {
                        ArrayList arrayList2 = userDefaultHeadActivity.f27221OooOo0o;
                        oOO00O ooo00o2 = new oOO00O(2);
                        ooo00o2.f27689OooO0O0 = userDefaultHeadItemModel;
                        ooo00o2.f27691OooO0Oo = 1;
                        arrayList2.add(ooo00o2);
                    }
                }
            }
        }
        int i = 0;
        for (Object obj : userDefaultHeadActivity.f27221OooOo0o) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel2 = ((oOO00O) obj).f27689OooO0O0;
            if (userDefaultHeadItemModel2 != null && userDefaultHeadItemModel2.getIsCurrent()) {
                userDefaultHeadActivity.f27217OooOo = i;
            }
            i = i2;
        }
        Lazy lazy = userDefaultHeadActivity.f27218OooOo0;
        ((o00O00O) lazy.getValue()).f27613OooOoO = userDefaultHeadActivity.f27217OooOo;
        ((o00O00O) lazy.getValue()).OooOoO0(userDefaultHeadActivity.f27221OooOo0o);
        return Unit.INSTANCE;
    }
}
