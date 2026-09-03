package p484o0o00O;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o00O0O;
import p203o00o0o0o.o00O0OO;
import p203o00o0o0o.oo0o0O0;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O0O0;
import p377o0OOoOo.o000Oo0;
import p417o0OoO0.o000O0o;
import p485o0o00O0.o00O0OO0;
import p584o0oOooO0.oO00OOo0;
import p595o0oo00Oo.o0000Ooo;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O0 {

    public static final class OooO00o extends Lambda implements Function2<Integer, MoreModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f47725OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailCommentFragment f47726OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f47727OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f47728OooO0oO;

        /* JADX INFO: renamed from: o0o00O.o0000O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0482OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MoreTag.values().length];
                try {
                    iArr[MoreTag.copy.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MoreTag.delete.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MoreTag.hide.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MoreTag.report.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MoreTag.reply.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity, MomentCommentDetailModel momentCommentDetailModel, MomentDetailCommentFragment momentDetailCommentFragment, long j) {
            super(2);
            this.f47725OooO0Oo = fragmentActivity;
            this.f47727OooO0o0 = momentCommentDetailModel;
            this.f47726OooO0o = momentDetailCommentFragment;
            this.f47728OooO0oO = j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, MoreModel moreModel) {
            num.intValue();
            MoreModel moreModel2 = moreModel;
            if (moreModel2 == null) {
                return null;
            }
            int i = C0482OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
            MomentCommentDetailModel momentCommentDetailModel = this.f47727OooO0o0;
            if (i != 1) {
                MomentDetailCommentFragment momentDetailCommentFragment = this.f47726OooO0o;
                if (i == 2) {
                    long id = momentCommentDetailModel.getId();
                    StringBuilder sb = new StringBuilder();
                    sb.append(id);
                    momentDetailCommentFragment.deleteComment(sb.toString());
                } else if (i == 3) {
                    momentDetailCommentFragment.hideComment(this.f47728OooO0oO, momentCommentDetailModel.getId());
                } else if (i == 4) {
                    long id2 = momentCommentDetailModel.getId();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(id2);
                    momentDetailCommentFragment.reportComment(sb2.toString());
                } else if (i == 5) {
                    momentDetailCommentFragment.toReplyComment(momentCommentDetailModel);
                }
            } else {
                FragmentActivity activity = this.f47725OooO0Oo;
                TextView textView = new TextView(activity);
                o0000Ooo.OooO0OO(activity, momentCommentDetailModel.getContent(), textView, new oo0o0O0(momentCommentDetailModel));
                Intrinsics.checkNotNullExpressionValue(activity, "activity");
                o000O0o.OooO0o0(textView, activity, o0000.OooO0OO(oO00OOo0.Copied));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f47729OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Integer, MoreModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentReplyActivity f47730OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f47731OooO0o0;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MoreTag.values().length];
                try {
                    iArr[MoreTag.copy.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MoreTag.delete.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MoreTag.dislike.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MoreTag.report.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MoreTag.reply.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentCommentDetailModel momentCommentDetailModel, MomentReplyActivity momentReplyActivity) {
            super(2);
            this.f47730OooO0Oo = momentReplyActivity;
            this.f47731OooO0o0 = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, MoreModel moreModel) {
            num.intValue();
            MoreModel moreModel2 = moreModel;
            if (moreModel2 == null) {
                return null;
            }
            int i = OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
            MomentReplyActivity momentReplyActivity = this.f47730OooO0Oo;
            MomentCommentDetailModel momentCommentDetailModel = this.f47731OooO0o0;
            if (i == 1) {
                TextView textView = new TextView(momentReplyActivity);
                o0000Ooo.OooO0OO(momentReplyActivity, momentCommentDetailModel.getContent(), textView, new o00O0OO(momentCommentDetailModel));
                o000O0o.OooO0o0(textView, momentReplyActivity, o0000.OooO0OO(oO00OOo0.Copied));
            } else if (i == 2) {
                long id = momentCommentDetailModel.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                String string = sb.toString();
                momentReplyActivity.getClass();
                o000Oo0 o000oo1 = o000O0O0.f44227OooO0O0;
                String momentId = momentReplyActivity.OooOoo0().getMomentId();
                o00O0OO0 o00o0oo1 = new o00O0OO0(true, momentReplyActivity);
                o000oo1.getClass();
                LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
                linkedHashMapOooO00o.put("dyid", momentId);
                linkedHashMapOooO00o.put("cid", string);
                com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44149o0000O0O, o0000O.f44146o0000O, linkedHashMapOooO00o, o00o0oo1);
            } else if (i == 3) {
                MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
                if (currentMomentDetail != null) {
                    LiveEventBus.get("DISLIKE_COMMENT").post(new Pair(Long.valueOf(currentMomentDetail.getId()), Long.valueOf(momentCommentDetailModel.getId())));
                    momentReplyActivity.finish();
                }
            } else if (i == 4) {
                long id2 = momentCommentDetailModel.getId();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(id2);
                momentReplyActivity.OooOooo(sb2.toString());
            } else if (i == 5) {
                momentReplyActivity.OooOooO(500L);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f47732OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static void OooO00o(@Nullable MomentCommentDetailModel momentCommentDetailModel, long j, @Nullable MomentDetailCommentFragment momentDetailCommentFragment) {
        FragmentActivity activity;
        if (momentDetailCommentFragment == null || (activity = momentDetailCommentFragment.getActivity()) == null || momentCommentDetailModel == null || momentCommentDetailModel.getId() < 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        MoreTag moreTag = MoreTag.reply;
        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag.getText()), moreTag));
        MoreTag moreTag2 = MoreTag.copy;
        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag2.getText()), moreTag2));
        if (momentCommentDetailModel.getIsDel()) {
            MoreTag moreTag3 = MoreTag.delete;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag3.getText()), moreTag3));
        } else {
            MoreTag moreTag4 = MoreTag.hide;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag4.getText()), moreTag4));
            MoreTag moreTag5 = MoreTag.report;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag5.getText()), moreTag5));
        }
        o00O0O o00o0o2 = new o00O0O(activity, null);
        o00o0o2.OooOOO(arrayList);
        o00o0o2.OooOOo0(new OooO00o(activity, momentCommentDetailModel, momentDetailCommentFragment, j));
        o00o0o2.OooO(OooO0O0.f47729OooO0Oo);
        o00o0o2.OooOO0o();
    }

    public static void OooO0O0(@Nullable MomentCommentDetailModel momentCommentDetailModel, @Nullable MomentReplyActivity momentReplyActivity) {
        if (momentReplyActivity == null || momentCommentDetailModel == null || momentCommentDetailModel.getId() < 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        MoreTag moreTag = MoreTag.reply;
        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag.getText()), moreTag));
        MoreTag moreTag2 = MoreTag.copy;
        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag2.getText()), moreTag2));
        if (momentCommentDetailModel.getIsDel()) {
            MoreTag moreTag3 = MoreTag.delete;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag3.getText()), moreTag3));
        } else {
            MoreTag moreTag4 = MoreTag.dislike;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag4.getText()), moreTag4));
            MoreTag moreTag5 = MoreTag.report;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag5.getText()), moreTag5));
        }
        o00O0O o00o0o2 = new o00O0O(momentReplyActivity, null);
        o00o0o2.OooOOO(arrayList);
        o00o0o2.OooOOo0(new OooO0OO(momentCommentDetailModel, momentReplyActivity));
        o00o0o2.OooO(OooO0o.f47732OooO0Oo);
        o00o0o2.OooOO0o();
    }
}
