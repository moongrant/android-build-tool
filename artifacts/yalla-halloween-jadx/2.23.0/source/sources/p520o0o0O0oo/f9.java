package p520o0o0O0oo;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.WeeklyStarModel;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class f9 extends Lambda implements Function1<WeeklyStarModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53281OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(x6 x6Var) {
        super(1);
        this.f53281OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WeeklyStarModel weeklyStarModel) {
        WeeklyStarModel weeklyStarModel2 = weeklyStarModel;
        if (weeklyStarModel2 != null) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ActivityNotice);
            webPageInfo.f32821OooO0oo = false;
            webPageInfo.OooO0Oo(weeklyStarModel2.getWeekStarsTitle());
            webPageInfo.OooO0o0(weeklyStarModel2.getWeekStarsUrl());
            webPageInfo.f32827OooOOOO = o0oO0O0o.f46999OooooOO;
            Function2<? super WebPageInfo, ? super Boolean, Unit> function2 = this.f53281OooO0Oo.f53379OooOO0o;
            if (function2 != null) {
                function2.invoke(webPageInfo, Boolean.valueOf(weeklyStarModel2.getShopType()));
            }
        }
        return Unit.INSTANCE;
    }
}
