package p496o0o00Oo0;

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
import p318o0O0oOoo.o00O0OOO;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00Ooo;
import p384o0OOoo0O.o0OO00O;
import p423o0OoO0OO.o00O0O0O;
import p426o0OoO0o0.OooOOOO;
import p492o0o00OO0.o00O0O0;
import p562o0oOo000.o000000;
import p599o0oo00o.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends Lambda implements Function2<Integer, MoreModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f49660OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f49661OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f49662OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f49663OooO0oO;

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
    public m(long j, long j2, MomentReplyModel momentReplyModel, MomentReplyActivity momentReplyActivity) {
        super(2);
        this.f49660OooO0Oo = momentReplyActivity;
        this.f49662OooO0o0 = momentReplyModel;
        this.f49661OooO0o = j;
        this.f49663OooO0oO = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, MoreModel moreModel) {
        num.intValue();
        MoreModel moreModel2 = moreModel;
        if (moreModel2 == null) {
            return null;
        }
        long j = this.f49661OooO0o;
        long j2 = this.f49663OooO0oO;
        int i = OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
        MomentReplyActivity momentReplyActivity = this.f49660OooO0Oo;
        MomentReplyModel momentReplyModel = this.f49662OooO0o0;
        if (i == 1) {
            TextView textView = new TextView(momentReplyActivity);
            o00O0O.OooO0OO(momentReplyActivity, momentReplyModel.getContent(), textView, new o00O0OOO(momentReplyModel));
            o00O0O0O.OooO0o0(textView, momentReplyActivity, o0000.OooO0OO(o000000.Copied));
        } else if (i == 2) {
            long id = momentReplyModel.getId();
            StringBuilder sb = new StringBuilder();
            sb.append(id);
            String string = sb.toString();
            momentReplyActivity.getClass();
            o00Ooo o00ooo2 = o0OO00O.f43463OooO0O0;
            String momentId = momentReplyActivity.OooOoo0().getMomentId();
            o00O0O0 o00o0o0 = new o00O0O0(false, momentReplyActivity);
            o00ooo2.getClass();
            LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("dyid", momentId);
            linkedHashMapOooO00o.put("cid", string);
            OooO0OO.OooO0O0(null, Oooo0.f43408o0000O0O, Oooo0.f43405o0000O, linkedHashMapOooO00o, o00o0o0);
        } else if (i == 3) {
            long id2 = momentReplyModel.getId();
            List<MomentReplyModel> list = momentReplyActivity.OooOo().f13189OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
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
                momentReplyActivity.OooOo().f13189OooOOoo.get(i2).setHide(true);
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
