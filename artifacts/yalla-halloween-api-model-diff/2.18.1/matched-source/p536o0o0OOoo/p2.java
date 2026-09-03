package p536o0o0OOoo;

import android.view.View;
import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class p2 extends Lambda implements Function2<Integer, MoreModel, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ View f43839Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43840Oooo0oO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MoreTag.values().length];
            iArr[MoreTag.copy.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(View view, YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(2);
        this.f43839Oooo0o = view;
        this.f43840Oooo0oO = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, MoreModel moreModel) {
        num.intValue();
        MoreModel moreModel2 = moreModel;
        if (moreModel2 == null) {
            return null;
        }
        View view = this.f43839Oooo0o;
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f43840Oooo0oO;
        if (OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()] == 1) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
            String string = ((TextView) view).getText().toString();
            Objects.requireNonNull(yallaTeamMessageActivity);
            String string2 = yallaTeamMessageActivity.getString(R.string.Copied);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.Copied)");
            o00O0.OooO00o(string, yallaTeamMessageActivity, string2);
        }
        return Unit.INSTANCE;
    }
}
