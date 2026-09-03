package p511o0o0O;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.WeeklyStarModel;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends Lambda implements Function1<WeeklyStarModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51053OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(o00000OO o00000oo2) {
        super(1);
        this.f51053OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WeeklyStarModel weeklyStarModel) {
        WeeklyStarModel weeklyStarModel2 = weeklyStarModel;
        if (weeklyStarModel2 != null) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ActivityNotice);
            webPageInfo.f32285OooO0oo = false;
            webPageInfo.OooO0Oo(weeklyStarModel2.getWeekStarsTitle());
            webPageInfo.OooO0o0(weeklyStarModel2.getWeekStarsUrl());
            webPageInfo.f32291OooOOOO = o0OOo000.f48190Oooooo;
            Function2<? super WebPageInfo, ? super Boolean, Unit> function2 = this.f51053OooO0Oo.f50963OooOO0o;
            if (function2 != null) {
                function2.invoke(webPageInfo, Boolean.valueOf(weeklyStarModel2.getShopType()));
            }
        }
        return Unit.INSTANCE;
    }
}
