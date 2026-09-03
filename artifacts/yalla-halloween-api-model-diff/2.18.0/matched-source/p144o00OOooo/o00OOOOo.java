package p144o00OOooo;

import androidx.lifecycle.Observer;
import androidx.paging.compose.OooO0OO;
import com.app.base.fragment.room.RoomInfoProfileFragment;
import com.app.base.model.CategoryModel;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import com.yalla.yalla.ui.fragment.TopicPostPopularFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p164o00OoOo.o00O00OO;
import p517o0o0O00.o00O00;
import p581o0oOoOOo.oOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OOOOo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32047OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32048OooO0O0;

    public /* synthetic */ o00OOOOo(Object obj, int i) {
        this.f32047OooO00o = i;
        this.f32048OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f32047OooO00o) {
            case 0:
                RoomInfoProfileFragment.m76initDataObserver$lambda11((RoomInfoProfileFragment) this.f32048OooO0O0, (CategoryModel) obj);
                break;
            case 1:
                o00O00OO this$0 = (o00O00OO) this.f32048OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.BonusDetailReply");
                Room.BonusDetailReply bonusDetailReply = (Room.BonusDetailReply) obj;
                o00O00.OooO0O0("bonusDetail = " + bonusDetailReply);
                if (this$0.f32542OooO00o.f11478OoooO0O) {
                    if (bonusDetailReply.getGotbonus()) {
                        LuckyPacketDetailActivity.f22873OoooooO.OooO00o(this$0.f32542OooO00o, bonusDetailReply.getBonusid(), bonusDetailReply.getBonustype());
                    } else if (bonusDetailReply.getBonustotalnum() != bonusDetailReply.getBonusgrabnum()) {
                        oOO ooo = new oOO(this$0.f32542OooO00o);
                        ooo.f46075OooooOo = true;
                        int bonusid = bonusDetailReply.getBonusid();
                        int bonustype = bonusDetailReply.getBonustype();
                        String fromuseravatar = bonusDetailReply.getFromuseravatar();
                        Intrinsics.checkNotNullExpressionValue(fromuseravatar, "this.fromuseravatar");
                        String giftimg = bonusDetailReply.getGiftimg();
                        Intrinsics.checkNotNullExpressionValue(giftimg, "this.giftimg");
                        String fromusername = bonusDetailReply.getFromusername();
                        Intrinsics.checkNotNullExpressionValue(fromusername, "this.fromusername");
                        bonusDetailReply.getBonuscount();
                        String bonusinfo = bonusDetailReply.getBonusinfo();
                        Intrinsics.checkNotNullExpressionValue(bonusinfo, "this.bonusinfo");
                        ooo.OooOO0o(bonusid, bonustype, fromuseravatar, giftimg, fromusername, bonusinfo, null);
                        ooo.OooOO0();
                    } else {
                        oOO ooo2 = new oOO(this$0.f32542OooO00o);
                        ooo2.OooOOO0(bonusDetailReply.getBonusid(), bonusDetailReply.getBonustype());
                        ooo2.OooOO0();
                    }
                    break;
                }
                break;
            case 2:
                PostDetailActivity this$1 = (PostDetailActivity) this.f32048OooO0O0;
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.Oooo0oO(false);
                this$1.finish();
                break;
            case 3:
                TopicDetailActivity this$2 = (TopicDetailActivity) this.f32048OooO0O0;
                TopicInfoModel it = (TopicInfoModel) obj;
                TopicDetailActivity.OooO00o oooO00o2 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this$2.Oooo00o(it);
                break;
            case 4:
                Function1 tmp0 = (Function1) this.f32048OooO0O0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 5:
                TopicPostPopularFragment.m416initObserve$lambda8((TopicPostPopularFragment) this.f32048OooO0O0, (Long) obj);
                break;
            default:
                OooO0OO lazyPagingItems = (OooO0OO) this.f32048OooO0O0;
                Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
                lazyPagingItems.OooO0o();
                break;
        }
    }
}
