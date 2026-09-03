package p495o0o00OOO;

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
import p386o0OOoo0O.o000oOoO;
import p386o0OOoo0O.oo000o;
import p386o0OOoo0O.oo0o0Oo;
import p425o0OoO0OO.o00O0O0;
import p428o0OoO0o0.OooOOOO;
import p493o0o00O0o.oOo00o0o;
import p565o0oOo000.o000OOo;
import p600o0oo00Oo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends Lambda implements Function2<Integer, MoreModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f49602OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f49603OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f49604OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f49605OooO0oO;

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
    public o0000O(long j, long j2, MomentReplyModel momentReplyModel, MomentReplyActivity momentReplyActivity) {
        super(2);
        this.f49602OooO0Oo = momentReplyActivity;
        this.f49604OooO0o0 = momentReplyModel;
        this.f49603OooO0o = j;
        this.f49605OooO0oO = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, MoreModel moreModel) {
        num.intValue();
        MoreModel moreModel2 = moreModel;
        if (moreModel2 == null) {
            return null;
        }
        long j = this.f49603OooO0o;
        long j2 = this.f49605OooO0oO;
        int i = OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
        MomentReplyActivity momentReplyActivity = this.f49602OooO0Oo;
        MomentReplyModel momentReplyModel = this.f49604OooO0o0;
        if (i == 1) {
            TextView textView = new TextView(momentReplyActivity);
            o0000oo.OooO0OO(momentReplyActivity, momentReplyModel.getContent(), textView, new o000OO(momentReplyModel));
            o00O0O0.OooO0o0(textView, momentReplyActivity, o0000.OooO0OO(o000OOo.Copied));
        } else if (i == 2) {
            long id = momentReplyModel.getId();
            StringBuilder sb = new StringBuilder();
            sb.append(id);
            String string = sb.toString();
            momentReplyActivity.getClass();
            oo000o oo000oVar = oo0o0Oo.f43480OooO0O0;
            String momentId = momentReplyActivity.OooOoo0().getMomentId();
            oOo00o0o ooo00o0o = new oOo00o0o(false, momentReplyActivity);
            oo000oVar.getClass();
            LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("dyid", momentId);
            linkedHashMapOooO00o.put("cid", string);
            OooO0OO.OooO0O0(null, o000oOoO.f43408o0000O0O, o000oOoO.f43405o0000O, linkedHashMapOooO00o, ooo00o0o);
        } else if (i == 3) {
            long id2 = momentReplyModel.getId();
            List<MomentReplyModel> list = momentReplyActivity.OooOo().f13200OooOOoo;
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
                momentReplyActivity.OooOo().f13200OooOOoo.get(i2).setHide(true);
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
