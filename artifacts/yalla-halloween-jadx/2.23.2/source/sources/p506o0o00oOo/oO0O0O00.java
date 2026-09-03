package p506o0o00oOo;

import com.yalla.yalla.model.user.UserDefaultHeadListModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import com.yalla.yalla.ui.adapter.o00O00OO;
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
public final class oO0O0O00 extends Lambda implements Function1<List<UserDefaultHeadListModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserDefaultHeadActivity f50487OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O00(UserDefaultHeadActivity userDefaultHeadActivity) {
        super(1);
        this.f50487OooO0Oo = userDefaultHeadActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserDefaultHeadListModel> list) {
        List<UserDefaultHeadListModel> list2 = list;
        UserDefaultHeadActivity userDefaultHeadActivity = this.f50487OooO0Oo;
        if (list2 != null) {
            for (UserDefaultHeadListModel userDefaultHeadListModel : list2) {
                ArrayList arrayList = userDefaultHeadActivity.f26756OooOo0o;
                o00O00OO o00o00oo2 = new o00O00OO(1);
                o00o00oo2.f27130OooO0OO = userDefaultHeadListModel.getName();
                o00o00oo2.f27131OooO0Oo = 4;
                arrayList.add(o00o00oo2);
                List<UserDefaultHeadListModel.UserDefaultHeadItemModel> mItems = userDefaultHeadListModel.getMItems();
                if (mItems != null) {
                    for (UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel : mItems) {
                        ArrayList arrayList2 = userDefaultHeadActivity.f26756OooOo0o;
                        o00O00OO o00o00oo3 = new o00O00OO(2);
                        o00o00oo3.f27129OooO0O0 = userDefaultHeadItemModel;
                        o00o00oo3.f27131OooO0Oo = 1;
                        arrayList2.add(o00o00oo3);
                    }
                }
            }
        }
        int i = 0;
        for (Object obj : userDefaultHeadActivity.f26756OooOo0o) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel2 = ((o00O00OO) obj).f27129OooO0O0;
            if (userDefaultHeadItemModel2 != null && userDefaultHeadItemModel2.getIsCurrent()) {
                userDefaultHeadActivity.f26752OooOo = i;
            }
            i = i2;
        }
        Lazy lazy = userDefaultHeadActivity.f26753OooOo0;
        ((oOO00O) lazy.getValue()).f27230OooOoO = userDefaultHeadActivity.f26752OooOo;
        ((oOO00O) lazy.getValue()).OooOoO0(userDefaultHeadActivity.f26756OooOo0o);
        return Unit.INSTANCE;
    }
}
