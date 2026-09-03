package p484o0o00O;

import android.widget.TextView;
import com.code.android.util.o0000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O0O0;
import p377o0OOoOo.o000Oo0;
import p417o0OoO0.o000O0o;
import p485o0o00O0.o00O0OO0;
import p584o0oOooO0.oO00OOo0;
import p595o0oo00Oo.o0000Ooo;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends Lambda implements Function2<Integer, MoreModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f47738OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f47739OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f47740OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f47741OooO0oO;

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
    public o000OO(long j, long j2, MomentReplyModel momentReplyModel, MomentReplyActivity momentReplyActivity) {
        super(2);
        this.f47738OooO0Oo = momentReplyActivity;
        this.f47740OooO0o0 = momentReplyModel;
        this.f47739OooO0o = j;
        this.f47741OooO0oO = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, MoreModel moreModel) {
        num.intValue();
        MoreModel moreModel2 = moreModel;
        if (moreModel2 == null) {
            return null;
        }
        long j = this.f47739OooO0o;
        long j2 = this.f47741OooO0oO;
        int i = OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
        MomentReplyActivity momentReplyActivity = this.f47738OooO0Oo;
        MomentReplyModel momentReplyModel = this.f47740OooO0o0;
        if (i == 1) {
            TextView textView = new TextView(momentReplyActivity);
            o0000Ooo.OooO0OO(momentReplyActivity, momentReplyModel.getContent(), textView, new o0000O0O(momentReplyModel));
            o000O0o.OooO0o0(textView, momentReplyActivity, o0000.OooO0OO(oO00OOo0.Copied));
        } else if (i == 2) {
            long id = momentReplyModel.getId();
            StringBuilder sb = new StringBuilder();
            sb.append(id);
            String string = sb.toString();
            momentReplyActivity.getClass();
            o000Oo0 o000oo1 = o000O0O0.f44227OooO0O0;
            String momentId = momentReplyActivity.OooOoo0().getMomentId();
            o00O0OO0 o00o0oo1 = new o00O0OO0(false, momentReplyActivity);
            o000oo1.getClass();
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("dyid", momentId);
            linkedHashMapOooO00o.put("cid", string);
            OooO0OO.OooO0O0(null, o0000O.f44149o0000O0O, o0000O.f44146o0000O, linkedHashMapOooO00o, o00o0oo1);
        } else if (i == 3) {
            long id2 = momentReplyModel.getId();
            List<MomentReplyModel> list = momentReplyActivity.OooOo().f10111OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list, "baseAdapter.data");
            Iterator<MomentReplyModel> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (it.next().getId() == id2) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                momentReplyActivity.OooOo().f10111OooOOoo.get(i2).setHide(true);
                momentReplyActivity.OooOo().notifyDataSetChanged();
            }
            momentReplyActivity.OooOoO().hideReply(j, j2, id2);
            LiveEventBus.get("DISLIKE_REPLY").post(new Triple(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(id2)));
        } else if (i == 4) {
            long id3 = momentReplyModel.getId();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(id3);
            momentReplyActivity.OooOooo(sb2.toString());
        } else if (i == 5) {
            momentReplyActivity.OooOoo(momentReplyModel, 500L);
        }
        return Unit.INSTANCE;
    }
}
