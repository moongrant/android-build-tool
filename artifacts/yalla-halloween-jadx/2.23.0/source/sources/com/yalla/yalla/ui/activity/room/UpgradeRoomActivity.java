package com.yalla.yalla.ui.activity.room;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.BuildConfig;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.CommonListResult;
import com.yalla.yalla.model.CreateBarModel;
import java.util.LinkedHashMap;
import java.util.List;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeRoomActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RelativeLayout f26715OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RelativeLayout f26716OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RelativeLayout f26717OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageView f26718OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public RelativeLayout f26719OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public RelativeLayout f26720OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ImageView f26721OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImageView f26722OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ImageView f26723OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ImageView f26724OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f26725OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TextView f26726OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public LinearLayout f26727OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TextView f26728OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f26729OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ImageView f26730Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f26731Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f26732Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f26733Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f26734Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f26735Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f26736Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f26737Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f26738Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Button f26739Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f26740Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f26741OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public LinearLayout f26742OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f26743OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f26744OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public String f26745OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public List<CreateBarModel.CreatBarMemoy> f26746OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public CreateBarModel.CreatBarMemoy f26747OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f26748OoooOo0 = 1;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f26749OoooOoO = 0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f26750o000oOoO;

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f26752OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f26754OooO0o0;

        public OooO00o(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
            this.f26752OooO0Oo = relativeLayout;
            this.f26754OooO0o0 = relativeLayout2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            UpgradeRoomActivity upgradeRoomActivity = UpgradeRoomActivity.this;
            int iFloatValue = (int) (upgradeRoomActivity.f26744OoooO0O / ((Float) valueAnimator.getAnimatedValue()).floatValue());
            RelativeLayout relativeLayout = this.f26752OooO0Oo;
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = iFloatValue;
            layoutParams.width = iFloatValue;
            int iFloatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * upgradeRoomActivity.f26741OoooO);
            RelativeLayout relativeLayout2 = this.f26754OooO0o0;
            ViewGroup.LayoutParams layoutParams2 = relativeLayout2.getLayoutParams();
            layoutParams2.height = iFloatValue2;
            layoutParams2.width = iFloatValue2;
            relativeLayout2.setLayoutParams(layoutParams2);
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    public static void OooOo0(UpgradeRoomActivity upgradeRoomActivity, int i) {
        upgradeRoomActivity.f26749OoooOoO = i;
        if (i == 1) {
            upgradeRoomActivity.f26716OooOOo0.setBackgroundResource(oOo00OO0.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f26726OooOoo.setVisibility(0);
            upgradeRoomActivity.f26722OooOo0o.setVisibility(0);
            return;
        }
        if (i == 2) {
            RelativeLayout relativeLayout = upgradeRoomActivity.f26716OooOOo0;
            int i2 = oOo00OO0.bg_upgrage_room_bg_gone;
            relativeLayout.setBackgroundResource(i2);
            upgradeRoomActivity.f26715OooOOo.setBackgroundResource(i2);
            upgradeRoomActivity.f26726OooOoo.setVisibility(8);
            upgradeRoomActivity.f26728OooOooO.setVisibility(0);
            upgradeRoomActivity.f26718OooOo.setVisibility(0);
            return;
        }
        if (i == 3) {
            RelativeLayout relativeLayout2 = upgradeRoomActivity.f26716OooOOo0;
            int i3 = oOo00OO0.bg_upgrage_room_bg_gone;
            relativeLayout2.setBackgroundResource(i3);
            upgradeRoomActivity.f26715OooOOo.setBackgroundResource(i3);
            upgradeRoomActivity.f26717OooOOoo.setBackgroundResource(i3);
            upgradeRoomActivity.f26726OooOoo.setVisibility(8);
            upgradeRoomActivity.f26728OooOooO.setVisibility(8);
            upgradeRoomActivity.f26729OooOooo.setVisibility(0);
            upgradeRoomActivity.f26724OooOoO0.setVisibility(0);
            return;
        }
        if (i == 4) {
            RelativeLayout relativeLayout3 = upgradeRoomActivity.f26716OooOOo0;
            int i4 = oOo00OO0.bg_upgrage_room_bg_gone;
            relativeLayout3.setBackgroundResource(i4);
            upgradeRoomActivity.f26715OooOOo.setBackgroundResource(i4);
            upgradeRoomActivity.f26717OooOOoo.setBackgroundResource(i4);
            upgradeRoomActivity.f26720OooOo00.setBackgroundResource(i4);
            upgradeRoomActivity.f26726OooOoo.setVisibility(8);
            upgradeRoomActivity.f26728OooOooO.setVisibility(8);
            upgradeRoomActivity.f26729OooOooo.setVisibility(8);
            upgradeRoomActivity.f26732Oooo000.setVisibility(0);
            upgradeRoomActivity.f26723OooOoO.setVisibility(0);
            return;
        }
        if (i != 5) {
            return;
        }
        RelativeLayout relativeLayout4 = upgradeRoomActivity.f26716OooOOo0;
        int i5 = oOo00OO0.bg_upgrage_room_bg_gone;
        relativeLayout4.setBackgroundResource(i5);
        upgradeRoomActivity.f26715OooOOo.setBackgroundResource(i5);
        upgradeRoomActivity.f26717OooOOoo.setBackgroundResource(i5);
        upgradeRoomActivity.f26720OooOo00.setBackgroundResource(i5);
        upgradeRoomActivity.f26719OooOo0.setBackgroundResource(i5);
        upgradeRoomActivity.f26726OooOoo.setVisibility(8);
        upgradeRoomActivity.f26728OooOooO.setVisibility(8);
        upgradeRoomActivity.f26729OooOooo.setVisibility(8);
        upgradeRoomActivity.f26732Oooo000.setVisibility(8);
        upgradeRoomActivity.f26733Oooo00O.setVisibility(0);
        upgradeRoomActivity.f26723OooOoO.setVisibility(0);
    }

    public static void OooOo0O(Activity activity) {
        o0Oooo.o000000O.o0000 o0000Var;
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
        String string = oooO00o.OooO00o().f25001OooO0Oo.getValue() != null ? oooO00o.OooO00o().f25001OooO0Oo.getValue().toString() : "";
        if (TextUtils.isEmpty(string) && (o0000Var = p464o0Oooo.o000000O.f46724OoooOoo) != null && o0000Var.getValue() != null && !o0000Var.getValue().barid.isEmpty()) {
            string = o0000Var.getValue().barid;
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) UpgradeRoomActivity.class);
        intent.putExtra("UPGRADEROOM_ROOMID", string);
        activity.startActivity(intent);
    }

    public final void OooOo0o(int i, boolean z) {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        if ((this.f26748OoooOo0 != i || z) && !com.code.android.util.OooOo00.OooO00o(this.f26746OoooOOO)) {
            int i2 = this.f26748OoooOo0;
            if (i2 == 1) {
                this.f26721OooOo0O.setVisibility(8);
                relativeLayout = this.f26716OooOOo0;
            } else if (i2 == 2) {
                this.f26722OooOo0o.setVisibility(8);
                relativeLayout = this.f26715OooOOo;
            } else if (i2 == 3) {
                this.f26718OooOo.setVisibility(8);
                relativeLayout = this.f26717OooOOoo;
            } else if (i2 == 4) {
                this.f26724OooOoO0.setVisibility(8);
                relativeLayout = this.f26720OooOo00;
            } else if (i2 != 5) {
                relativeLayout = null;
            } else {
                this.f26723OooOoO.setVisibility(8);
                relativeLayout = this.f26719OooOo0;
            }
            List<CreateBarModel.CreatBarMemoy> list = this.f26746OoooOOO;
            int i3 = i - 1;
            this.f26747OoooOOo = list.get(i3 >= list.size() ? this.f26746OoooOOO.size() - 1 : i3);
            if (this.f26749OoooOoO != 0) {
                this.f26738Oooo0o0.setText((Integer.parseInt(this.f26747OoooOOo.maxnum) - Integer.parseInt(this.f26746OoooOOO.get(this.f26749OoooOoO - 1).maxnum)) + ",000");
            } else {
                this.f26738Oooo0o0.setText(Integer.parseInt(this.f26747OoooOOo.maxnum) + ",000");
            }
            if (this.f26745OoooOO0 != null && i <= this.f26749OoooOoO) {
                this.f26739Oooo0oO.setEnabled(false);
            } else {
                this.f26739Oooo0oO.setEnabled(true);
            }
            if (i <= this.f26749OoooOoO) {
                this.f26737Oooo0o.setVisibility(0);
                this.f26742OoooO0.setVisibility(4);
                int i4 = this.f26749OoooOoO;
                if (i4 == 1) {
                    this.f26737Oooo0o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.user_room_type), getResources().getString(oO00OOo0.money_bar_title_1)));
                } else if (i4 == 2) {
                    this.f26737Oooo0o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.user_room_type), getResources().getString(oO00OOo0.money_bar_title_2)));
                } else if (i4 != 3) {
                    if (i4 == 4) {
                        this.f26737Oooo0o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.user_room_type), getResources().getString(oO00OOo0.money_bar_title_4)));
                    } else if (i4 == 5) {
                    }
                    this.f26737Oooo0o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.user_room_type), getResources().getString(oO00OOo0.money_bar_title_5)));
                } else {
                    this.f26737Oooo0o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.user_room_type), getResources().getString(oO00OOo0.money_bar_title_3)));
                }
            } else {
                this.f26737Oooo0o.setVisibility(4);
                this.f26742OoooO0.setVisibility(0);
            }
            this.f26734Oooo00o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.room_online_num_des), p590o0oo0.OooOOOO.OooO0Oo(this.f26746OoooOOO.get(i3).maxline)));
            if (i == 1) {
                this.f26721OooOo0O.setVisibility(0);
                relativeLayout2 = this.f26716OooOOo0;
                this.f26740Oooo0oo.setText(oO00OOo0.money_bar_title_1);
                this.f26738Oooo0o0.setText(oO00OOo0.money_Free);
                this.f26735Oooo0O0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.room_info_rank), BuildConfig.VERSION_NAME));
                this.f26736Oooo0OO.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.MAX_XXX_members_in_the_room), "1000"));
                this.f26730Oooo.setVisibility(8);
                this.f26731Oooo0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.room_info_administor), "7"));
            } else {
                if (i != 2) {
                    if (i == 3) {
                        this.f26718OooOo.setVisibility(0);
                        relativeLayout2 = this.f26717OooOOoo;
                        this.f26740Oooo0oo.setText(oO00OOo0.money_bar_title_3);
                        this.f26735Oooo0O0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.room_info_rank), "1.3"));
                        this.f26736Oooo0OO.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.MAX_XXX_members_in_the_room), "3000"));
                        this.f26730Oooo.setVisibility(0);
                        this.f26731Oooo0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.room_info_administor), "7"));
                    } else if (i == 4) {
                        this.f26724OooOoO0.setVisibility(0);
                        relativeLayout3 = this.f26720OooOo00;
                        this.f26740Oooo0oo.setText(oO00OOo0.money_bar_title_4);
                        this.f26735Oooo0O0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.room_info_rank), "1.5"));
                        this.f26736Oooo0OO.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.MAX_XXX_members_in_the_room), "40000"));
                        this.f26730Oooo.setVisibility(0);
                        this.f26731Oooo0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.room_info_administor), "13"));
                    } else if (i != 5) {
                        relativeLayout3 = null;
                    } else {
                        this.f26723OooOoO.setVisibility(0);
                        relativeLayout3 = this.f26719OooOo0;
                        this.f26740Oooo0oo.setText(oO00OOo0.money_bar_title_5);
                        this.f26735Oooo0O0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.room_info_rank), "1.8"));
                        this.f26736Oooo0OO.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.MAX_XXX_members_in_the_room), "50000"));
                        this.f26730Oooo.setVisibility(0);
                        this.f26731Oooo0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.room_info_administor), "20"));
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, this.f26750o000oOoO);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new OooO00o(relativeLayout, relativeLayout3));
                    valueAnimatorOfFloat.setDuration(300L).start();
                    this.f26748OoooOo0 = i;
                }
                this.f26722OooOo0o.setVisibility(0);
                relativeLayout2 = this.f26715OooOOo;
                this.f26740Oooo0oo.setText(oO00OOo0.money_bar_title_2);
                this.f26735Oooo0O0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.room_info_rank), "1.2"));
                this.f26736Oooo0OO.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.MAX_XXX_members_in_the_room), "2000"));
                this.f26730Oooo.setVisibility(0);
                this.f26731Oooo0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(oO00OOo0.room_info_administor), "7"));
            }
            relativeLayout3 = relativeLayout2;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, this.f26750o000oOoO);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.addUpdateListener(new OooO00o(relativeLayout, relativeLayout3));
            valueAnimatorOfFloat2.setDuration(300L).start();
            this.f26748OoooOo0 = i;
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == oO00O0oO.rl_bg_1) {
            OooOo0o(1, false);
            return;
        }
        if (id == oO00O0oO.rl_bg_2) {
            OooOo0o(2, false);
            return;
        }
        if (id == oO00O0oO.rl_bg_3) {
            OooOo0o(3, false);
            return;
        }
        if (id == oO00O0oO.rl_bg_4) {
            OooOo0o(4, false);
            return;
        }
        if (id == oO00O0oO.rl_bg_5) {
            OooOo0o(5, false);
            return;
        }
        if (id == oO00O0oO.bt_commit) {
            String str = this.f26745OoooOO0;
            String strValueOf = String.valueOf(this.f26748OoooOo0);
            o0O0o00O o0o0o00o = new o0O0o00O(this, this);
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("barid", str);
            linkedHashMapOooO00o.put("type", strValueOf);
            o0o0o00o.f23395OooO0O0 = true;
            o0o0o00o.f23396OooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.loading);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44115OoooO, linkedHashMapOooO00o, o0o0o00o);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_upgraderoom);
        this.f26716OooOOo0 = (RelativeLayout) findViewById(oO00O0oO.rl_bg_1);
        this.f26715OooOOo = (RelativeLayout) findViewById(oO00O0oO.rl_bg_2);
        this.f26717OooOOoo = (RelativeLayout) findViewById(oO00O0oO.rl_bg_3);
        this.f26720OooOo00 = (RelativeLayout) findViewById(oO00O0oO.rl_bg_4);
        this.f26719OooOo0 = (RelativeLayout) findViewById(oO00O0oO.rl_bg_5);
        this.f26721OooOo0O = (ImageView) findViewById(oO00O0oO.iv_selected_tag1);
        this.f26722OooOo0o = (ImageView) findViewById(oO00O0oO.iv_selected_tag2);
        this.f26718OooOo = (ImageView) findViewById(oO00O0oO.iv_selected_tag3);
        this.f26724OooOoO0 = (ImageView) findViewById(oO00O0oO.iv_selected_tag4);
        this.f26723OooOoO = (ImageView) findViewById(oO00O0oO.iv_selected_tag5);
        this.f26725OooOoOO = findViewById(oO00O0oO.v);
        this.f26727OooOoo0 = (LinearLayout) findViewById(oO00O0oO.ll_room);
        this.f26726OooOoo = (TextView) findViewById(oO00O0oO.bt_my_tag1);
        this.f26728OooOooO = (TextView) findViewById(oO00O0oO.bt_my_tag2);
        this.f26729OooOooo = (TextView) findViewById(oO00O0oO.bt_my_tag3);
        this.f26732Oooo000 = (TextView) findViewById(oO00O0oO.bt_my_tag4);
        this.f26733Oooo00O = (TextView) findViewById(oO00O0oO.bt_my_tag5);
        this.f26734Oooo00o = (TextView) findViewById(oO00O0oO.tv_tips1_des);
        this.f26731Oooo0 = (TextView) findViewById(oO00O0oO.tv_tips2_des);
        this.f26735Oooo0O0 = (TextView) findViewById(oO00O0oO.tv_tips3_des);
        this.f26736Oooo0OO = (TextView) findViewById(oO00O0oO.activity_upgraderoom_tv_memberNum_des);
        this.f26738Oooo0o0 = (TextView) findViewById(oO00O0oO.tv_price);
        this.f26737Oooo0o = (TextView) findViewById(oO00O0oO.tv_tips_coin);
        this.f26739Oooo0oO = (Button) findViewById(oO00O0oO.bt_commit);
        this.f26740Oooo0oo = (TextView) findViewById(oO00O0oO.tv_room_type_name);
        this.f26730Oooo = (ImageView) findViewById(oO00O0oO.iv_coin);
        this.f26743OoooO00 = (TextView) findViewById(oO00O0oO.tv_creat_tips);
        this.f26742OoooO0 = (LinearLayout) findViewById(oO00O0oO.ll_room_parice);
        int width = (getWindowManager().getDefaultDisplay().getWidth() - com.android.billingclient.api.o0Oo0oo.OooO00o(this, 67.0d)) / 5;
        this.f26741OoooO = width;
        int iOooO00o = com.android.billingclient.api.o0Oo0oo.OooO00o(this, 11.0d) + width;
        this.f26744OoooO0O = iOooO00o;
        this.f26750o000oOoO = iOooO00o / this.f26741OoooO;
        ViewGroup.LayoutParams layoutParams = this.f26716OooOOo0.getLayoutParams();
        int i = this.f26744OoooO0O;
        layoutParams.width = i;
        layoutParams.height = i;
        ViewGroup.LayoutParams layoutParams2 = this.f26715OooOOo.getLayoutParams();
        int i2 = this.f26741OoooO;
        layoutParams2.width = i2;
        layoutParams2.height = i2;
        ViewGroup.LayoutParams layoutParams3 = this.f26717OooOOoo.getLayoutParams();
        int i3 = this.f26741OoooO;
        layoutParams3.width = i3;
        layoutParams3.height = i3;
        ViewGroup.LayoutParams layoutParams4 = this.f26720OooOo00.getLayoutParams();
        int i4 = this.f26741OoooO;
        layoutParams4.width = i4;
        layoutParams4.height = i4;
        ViewGroup.LayoutParams layoutParams5 = this.f26719OooOo0.getLayoutParams();
        int i5 = this.f26741OoooO;
        layoutParams5.width = i5;
        layoutParams5.height = i5;
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, this.f26744OoooO0O);
        layoutParams6.gravity = 17;
        this.f26727OooOoo0.setLayoutParams(layoutParams6);
        this.f26716OooOOo0.setOnClickListener(this);
        this.f26715OooOOo.setOnClickListener(this);
        this.f26717OooOOoo.setOnClickListener(this);
        this.f26720OooOo00.setOnClickListener(this);
        this.f26719OooOo0.setOnClickListener(this);
        this.f26739Oooo0oO.setOnClickListener(this);
        String stringExtra = getIntent().getStringExtra("UPGRADEROOM_ROOMID");
        this.f26745OoooOO0 = stringExtra;
        if (com.code.android.util.OooOo00.OooO0O0(stringExtra)) {
            String str = this.f26745OoooOO0;
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(this) { // from class: com.yalla.yalla.ui.activity.room.UpgradeRoomActivity.2
                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(String str2) {
                    List<T> list;
                    CommonListResult commonListResult = (CommonListResult) p579o0oOoo.oOo00OO0.OooO0O0(str2, new TypeToken<CommonListResult<CreateBarModel.CreatBarMemoy>>() { // from class: com.yalla.yalla.ui.activity.room.UpgradeRoomActivity.2.1
                    }.getType());
                    if (commonListResult == null || (list = commonListResult.data) == 0 || list.size() <= 0) {
                        return;
                    }
                    List list2 = commonListResult.data;
                    UpgradeRoomActivity upgradeRoomActivity = UpgradeRoomActivity.this;
                    upgradeRoomActivity.f26746OoooOOO = list2;
                    UpgradeRoomActivity.OooOo0(upgradeRoomActivity, commonListResult.bartype);
                    int i6 = commonListResult.bartype;
                    upgradeRoomActivity.OooOo0o(i6 != 5 ? i6 + 1 : 5, true);
                }
            };
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("barid", str);
            oooO0O0.f23395OooO0O0 = true;
            oooO0O0.f23396OooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.loading);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44118OoooO0O, linkedHashMapOooO00o, oooO0O0);
            this.f26739Oooo0oO.setText(oO00OOo0.Upgrade);
            OooOOoo(oO00OOo0.title_activity_upbar);
            this.f26743OoooO00.setVisibility(8);
        }
    }
}
