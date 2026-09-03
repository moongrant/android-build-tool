package p159o00OoOO;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.adapter.message.MessageModelHeadType;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.view.CrossRecyclerView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.data.constant.RoomLoginState;
import com.yalla.yalla.model.GifListJson;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.MessageBoxFragment;
import com.yalla.yalla.ui.fragment.UserNewPostFragment;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p139o00OOOo0.o0ooOOo;
import p142o00OOooO.o0000O;
import p254o00ooO0O.o000O0O0;
import p530o0o0OOO.o00O;
import p538o0o0Oo0.oO00000o;
import p563o0oOo0.o0OO00O;
import p579o0oOoOOo.oOOOOo0O;
import p621o0oo0o0o.o00O0O00;
import p707oOooo0o.o00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000OO implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32408OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32409OooO0O0;

    public /* synthetic */ o00000OO(Object obj, int i) {
        this.f32408OooO00o = i;
        this.f32409OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        long time;
        int iCurrentTimeMillis = 0;
        int i = 1;
        o0OO00O o0oo00o2 = null;
        switch (this.f32408OooO00o) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f32409OooO0O0;
                RoomLoginState roomLoginState = (RoomLoginState) obj;
                int i2 = MixedRoomActivity.f11764o00000oO;
                Objects.requireNonNull(mixedRoomActivity);
                if (roomLoginState == RoomLoginState.Login) {
                    if (mixedRoomActivity.f11768OooooO0 == null) {
                        Objects.requireNonNull(o0ooOOo.OooO00o());
                        o00 o00Var = new o00();
                        mixedRoomActivity.f11768OooooO0 = o00Var;
                        o00Var.f53023OooO0O0 = new o0000O0(mixedRoomActivity);
                    }
                    try {
                        mixedRoomActivity.f11768OooooO0.OooO00o(mixedRoomActivity, o000O0O0.OooO0OO(R.string.loading));
                    } catch (Exception e) {
                        e.printStackTrace();
                        mixedRoomActivity.f11768OooooO0 = null;
                        return;
                    }
                } else if (roomLoginState == RoomLoginState.Succes) {
                    mixedRoomActivity.OooOoo0();
                    mixedRoomActivity.f11781o00000OO.getConveneMemberState(o00O.OooO0O0.f43203OooO00o.OooO00o());
                } else if (roomLoginState == RoomLoginState.Error) {
                    mixedRoomActivity.OooOoo0();
                    mixedRoomActivity.Oooo0O0(OooOOO.OooO0OO(R.string.net_connection_error));
                } else if (roomLoginState == RoomLoginState.Closed) {
                    mixedRoomActivity.OooOoo0();
                    mixedRoomActivity.Oooo0O0(OooOOO.OooO0OO(R.string.Room_Closed));
                } else if (roomLoginState == RoomLoginState.NumberLimit) {
                    mixedRoomActivity.OooOoo0();
                    mixedRoomActivity.Oooo0O0(OooOOO.OooO0OO(R.string.microom_code_1006));
                }
                break;
            case 1:
                PrivateChatActivity this$0 = (PrivateChatActivity) this.f32409OooO0O0;
                String s = (String) obj;
                PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(s, "s");
                this$0.f22183o00ooo = s;
                this$0.OooOoO0(s);
                this$0.f22182o00o0O.setUserName(this$0.f22183o00ooo);
                break;
            case 2:
                TopicSearchActivity this$1 = (TopicSearchActivity) this.f32409OooO0O0;
                Response response = (Response) obj;
                TopicSearchActivity.OooO00o oooO00o2 = TopicSearchActivity.f22654OooooOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (this$1.f22659OooooOO) {
                    if (response.getIsSuccess()) {
                        this$1.OooOoo().setNewData((List) response.getData());
                        if ((this$1.OooOooo().f50360OooO00o.getParent() == null ? 1 : 0) != 0) {
                            this$1.OooOoo().setHeaderView(this$1.OooOooo().f50360OooO00o);
                        }
                    }
                    this$1.OooOoo().setLoadComplete(response.getIsSuccess());
                    break;
                }
                break;
            case 3:
                UserInfoActivity this$2 = (UserInfoActivity) this.f32409OooO0O0;
                String date = (String) obj;
                UserInfoActivity.OooO00o oooO00o3 = UserInfoActivity.f23452o0ooOO0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (o0000O.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o, this$2.f23456OooooO0)) {
                    TextView textView = this$2.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50062OooOoO0;
                    o00O0O00 o00o0o01 = o00O0O00.f48626OooO00o;
                    Intrinsics.checkNotNullExpressionValue(date, "birthday");
                    Intrinsics.checkNotNullParameter(date, "date");
                    if (!TextUtils.isEmpty(date) && !Intrinsics.areEqual("-1", date)) {
                        Intrinsics.checkNotNullParameter(date, "date");
                        if (TextUtils.isEmpty(date) || Intrinsics.areEqual("-1", date)) {
                            time = 0;
                        } else {
                            time = -1;
                            try {
                                time = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(date).getTime();
                            } catch (ParseException e2) {
                                e2.printStackTrace();
                            }
                        }
                        iCurrentTimeMillis = (int) (((System.currentTimeMillis() - time) / ((long) 86400000)) / ((long) 365));
                    }
                    textView.setText(String.valueOf(iCurrentTimeMillis));
                }
                break;
            case 4:
                oOOOOo0O this$3 = (oOOOOo0O) this.f32409OooO0O0;
                List<GifListJson> list = (List) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (list != null && list.size() > 0) {
                    if (list.size() > 1) {
                        CrossRecyclerView crossRecyclerView = this$3.f46183OoooO.f49672OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(crossRecyclerView, "emojiPanelBinding.rvEmojiPanelContent");
                        o00O0O.OooO(crossRecyclerView);
                        View view = this$3.f46183OoooO.f49674OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(view, "emojiPanelBinding.vSplitLine");
                        o00O0O.OooO(view);
                        RecyclerView recyclerView = this$3.f46183OoooO.f49673OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "emojiPanelBinding.rvEmojiPanelTable");
                        o00O0O.OooO(recyclerView);
                        this$3.OooOOO0(list);
                        this$3.f46183OoooO.f49673OooO0OO.setLayoutManager(new FixLinearLayoutManager(this$3.f41543Oooo0o, 0));
                        oOOOOo0O.OooO0O0 oooO0O0 = new oOOOOo0O.OooO0O0(this$3, this$3.f41543Oooo0o, list);
                        this$3.f46187o000oOoO = oooO0O0;
                        this$3.f46183OoooO.f49673OooO0OO.setAdapter(oooO0O0);
                        oOOOOo0O.OooO0O0 oooO0O1 = this$3.f46187o000oOoO;
                        if (oooO0O1 != null) {
                            oooO0O1.setOnItemClickListener(new oO00000o(this$3, i));
                        }
                    } else if (list.size() == 1) {
                        CrossRecyclerView crossRecyclerView2 = this$3.f46183OoooO.f49672OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(crossRecyclerView2, "emojiPanelBinding.rvEmojiPanelContent");
                        o00O0O.OooO00o(crossRecyclerView2);
                        View view2 = this$3.f46183OoooO.f49674OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(view2, "emojiPanelBinding.vSplitLine");
                        o00O0O.OooO00o(view2);
                        RecyclerView recyclerView2 = this$3.f46183OoooO.f49673OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "emojiPanelBinding.rvEmojiPanelTable");
                        o00O0O.OooO00o(recyclerView2);
                        this$3.OooOOO0(list);
                    }
                    break;
                }
                break;
            case 5:
                BadgeFragment.m310initView$lambda2((BadgeFragment) this.f32409OooO0O0, (Integer) obj);
                break;
            case 6:
                MessageBoxFragment this$4 = (MessageBoxFragment) this.f32409OooO0O0;
                Integer num = (Integer) obj;
                int i3 = MessageBoxFragment.f24012OoooOoo;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                o0OO00O o0oo00o3 = this$4.f24013OoooOOO;
                if (o0oo00o3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
                } else {
                    o0oo00o2 = o0oo00o3;
                }
                o0oo00o2.OooO0O0(MessageModelHeadType.TypeSystem, num != null ? num.intValue() : 0);
                break;
            default:
                UserNewPostFragment.m429initObserver$lambda3((UserNewPostFragment) this.f32409OooO0O0, (Long) obj);
                break;
        }
    }
}
