package p566o0oOo00O;

import com.yalla.yalla.model.UserDefaultHeadListModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p563o0oOo0.o00O000;
import p563o0oOo0.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO000 extends Lambda implements Function1<List<UserDefaultHeadListModel>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserDefaultHeadActivity f45272Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(UserDefaultHeadActivity userDefaultHeadActivity) {
        super(1);
        this.f45272Oooo0o = userDefaultHeadActivity;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o0oOo0.o00O000o>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList, java.util.List<o0oOo0.o00O000o>] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList, java.util.List<o0oOo0.o00O000o>] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserDefaultHeadListModel> list) {
        List<UserDefaultHeadListModel> list2 = list;
        if (list2 != null) {
            UserDefaultHeadActivity userDefaultHeadActivity = this.f45272Oooo0o;
            for (UserDefaultHeadListModel userDefaultHeadListModel : list2) {
                ?? r3 = userDefaultHeadActivity.f23432OooooOO;
                o00O000o o00o000o2 = new o00O000o(1);
                o00o000o2.f45075OooO0OO = userDefaultHeadListModel.getName();
                o00o000o2.f45076OooO0Oo = 4;
                r3.add(o00o000o2);
                List<UserDefaultHeadListModel.UserDefaultHeadItemModel> mItems = userDefaultHeadListModel.getMItems();
                if (mItems != null) {
                    for (UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel : mItems) {
                        ?? r4 = userDefaultHeadActivity.f23432OooooOO;
                        o00O000o o00o000o3 = new o00O000o(2);
                        o00o000o3.f45074OooO0O0 = userDefaultHeadItemModel;
                        o00o000o3.f45076OooO0Oo = 1;
                        r4.add(o00o000o3);
                    }
                }
            }
        }
        UserDefaultHeadActivity userDefaultHeadActivity2 = this.f45272Oooo0o;
        int i = 0;
        for (Object obj : userDefaultHeadActivity2.f23432OooooOO) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel2 = ((o00O000o) obj).f45074OooO0O0;
            if (userDefaultHeadItemModel2 != null && userDefaultHeadItemModel2.getIsCurrent()) {
                userDefaultHeadActivity2.f23433OooooOo = i;
            }
            i = i2;
        }
        o00O000 o00o000OooOoo = UserDefaultHeadActivity.OooOoo(this.f45272Oooo0o);
        UserDefaultHeadActivity userDefaultHeadActivity3 = this.f45272Oooo0o;
        o00o000OooOoo.f45069OooO0OO = userDefaultHeadActivity3.f23433OooooOo;
        ((o00O000) userDefaultHeadActivity3.f23430Ooooo0o.getValue()).setNewData(this.f45272Oooo0o.f23432OooooOO);
        return Unit.INSTANCE;
    }
}
