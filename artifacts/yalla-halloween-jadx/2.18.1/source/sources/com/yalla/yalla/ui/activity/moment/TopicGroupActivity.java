package com.yalla.yalla.ui.activity.moment;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.TopicGroupInfoModel;
import com.yalla.yalla.ui.activity.BaseComposeActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p594o0oOoooO.r5;
import p594o0oOoooO.s5;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicGroupActivity;", "Lcom/yalla/yalla/ui/activity/BaseComposeActivity;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicGroupActivity extends BaseComposeActivity {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f22619OoooO0 = LazyKt.lazy(new OooO0O0());

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f22621Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f22621Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            TopicGroupActivity.this.OooOOo0(ooo00o, this.f22621Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<TopicGroupInfoModel> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TopicGroupInfoModel invoke() {
            return (TopicGroupInfoModel) TopicGroupActivity.this.getIntent().getSerializableExtra("Module");
        }
    }

    public final TopicGroupInfoModel OooOOo() {
        return (TopicGroupInfoModel) this.f22619OoooO0.getValue();
    }

    @Override // com.yalla.yalla.ui.activity.BaseComposeActivity
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOOo0(@Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1471817866);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        TopicGroupInfoModel topicGroupInfoModelOooOOo = OooOOo();
        if (topicGroupInfoModelOooOOo != null && topicGroupInfoModelOooOOo.getType() == 2) {
            ooo00oOooOOo.OooO0o0(-1060018550);
            s5.f47537OooO00o.OooO0o0(OooOOo(), ooo00oOooOOo, 56);
            ooo00oOooOOo.Oooo0o0();
        } else {
            ooo00oOooOOo.OooO0o0(-1060018487);
            r5.f47512OooO00o.OooO0o0(OooOOo(), ooo00oOooOOo, 56);
            ooo00oOooOOo.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(i));
    }
}
