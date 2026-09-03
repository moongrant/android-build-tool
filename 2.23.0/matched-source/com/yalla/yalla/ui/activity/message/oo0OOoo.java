package com.yalla.yalla.ui.activity.message;

import android.view.View;
import android.widget.TextView;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0OOoo extends Lambda implements Function2<Integer, MoreModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f25995OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25996OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MoreTag.values().length];
            try {
                iArr[MoreTag.copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0OOoo(View view, YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(2);
        this.f25995OooO0Oo = view;
        this.f25996OooO0o0 = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, MoreModel moreModel) {
        num.intValue();
        MoreModel moreModel2 = moreModel;
        if (moreModel2 == null) {
            return null;
        }
        if (OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()] == 1) {
            View view = this.f25995OooO0Oo;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
            String string = ((TextView) view).getText().toString();
            YallaTeamMessageActivity yallaTeamMessageActivity = this.f25996OooO0o0;
            yallaTeamMessageActivity.getClass();
            String string2 = yallaTeamMessageActivity.getString(oO00OOo0.Copied);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.Copied)");
            p417o0OoO0.o0000O0O.OooO00o(yallaTeamMessageActivity, string, string2);
        }
        return Unit.INSTANCE;
    }
}
