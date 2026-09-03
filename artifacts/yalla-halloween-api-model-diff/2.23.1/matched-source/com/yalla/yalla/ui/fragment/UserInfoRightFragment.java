package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.material.internal.FlowLayout;
import com.yalla.yalla.model.user.UserInfoModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import p587o0oOooO.oO000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public class UserInfoRightFragment extends com.yalla.yalla.base.fragment.OooO00o {
    FlowLayout flTag;
    ImageView ivUserConstellation;
    TextView tvTagHint;
    TextView tvUserConstellation;
    TextView tvUserLanguage;
    TextView tvUserTime;

    private void initView() {
        this.tvUserLanguage = (TextView) this.rootView.findViewById(p565o0oOo000.o0Oo0oo.tv_user_language);
        this.tvUserConstellation = (TextView) this.rootView.findViewById(p565o0oOo000.o0Oo0oo.tv_user_constellation);
        this.tvUserTime = (TextView) this.rootView.findViewById(p565o0oOo000.o0Oo0oo.tv_userinfo_time);
        this.ivUserConstellation = (ImageView) this.rootView.findViewById(p565o0oOo000.o0Oo0oo.iv_user_constellation);
        this.flTag = (FlowLayout) this.rootView.findViewById(p565o0oOo000.o0Oo0oo.fl_userinfo_tag);
        this.tvTagHint = (TextView) this.rootView.findViewById(p565o0oOo000.o0Oo0oo.tv_userinfo_tag_hint);
    }

    public static UserInfoRightFragment newInstantce() {
        UserInfoRightFragment userInfoRightFragment = new UserInfoRightFragment();
        userInfoRightFragment.setArguments(new Bundle());
        return userInfoRightFragment;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.rootView = layoutInflater.inflate(p565o0oOo000.o0OO00O.user_fragment_userinfo_right, viewGroup, false);
        initView();
        return this.rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void updataInfo(UserInfoModel userInfoModel) {
        FlowLayout flowLayout;
        Date time;
        int i;
        if (userInfoModel == null || isDetached() || (flowLayout = this.flTag) == null) {
            return;
        }
        flowLayout.removeAllViews();
        if (!com.code.android.util.OooOo00.OooO0O0(userInfoModel.getTags()) || getContext() == null) {
            this.tvTagHint.setVisibility(0);
        } else {
            this.tvTagHint.setVisibility(8);
            for (int i2 = 0; i2 < userInfoModel.getTags().size(); i2++) {
                View viewInflate = View.inflate(getContext(), p565o0oOo000.o0OO00O.item_flow_tag_userinfo, null);
                ((TextView) viewInflate.findViewById(p565o0oOo000.o0Oo0oo.tv_tag_flow_userinfo)).setText(userInfoModel.getTags().get(i2).getTagName());
                this.flTag.addView(viewInflate);
            }
        }
        this.tvUserTime.setText(userInfoModel.getRegTime() + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.days));
        switch (userInfoModel.getRegion()) {
            case 0:
                this.tvUserLanguage.setText(p565o0oOo000.o000OOo.English);
                break;
            case 1:
                this.tvUserLanguage.setText(p565o0oOo000.o000OOo.Arabic);
                break;
            case 2:
                this.tvUserLanguage.setText(p565o0oOo000.o000OOo.Turkish);
                break;
            case 3:
                this.tvUserLanguage.setText(p565o0oOo000.o000OOo.Indonesia);
                break;
            case 4:
            default:
                this.tvUserLanguage.setText("");
                break;
            case 5:
                this.tvUserLanguage.setText(p565o0oOo000.o000OOo.Portuguese);
                break;
            case 6:
                this.tvUserLanguage.setText(p565o0oOo000.o000OOo.Spanish);
                break;
            case 7:
                this.tvUserLanguage.setText(p565o0oOo000.o000OOo.Hindi);
                break;
            case 8:
                this.tvUserLanguage.setText(p565o0oOo000.o000OOo.Urdu);
                break;
        }
        try {
            time = new SimpleDateFormat("yyyy-MM-dd").parse(userInfoModel.getBirthday());
        } catch (Exception unused) {
            time = Calendar.getInstance().getTime();
        }
        int month = time.getMonth() + 1;
        int date = time.getDate();
        int i3 = month - 1;
        int i4 = oO000Oo0.f56687OooOOO0[i3];
        int[] iArr = oO000Oo0.f56686OooOOO;
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(date < i4 ? iArr[i3] : iArr[month]);
        if (getContext() != null) {
            ImageView imageView = this.ivUserConstellation;
            Context context = getContext();
            if (strOooO0OO.equals(context.getString(oO000Oo0.f56675OooO00o))) {
                i = p565o0oOo000.o0OOO0o.aries;
            } else if (strOooO0OO.equals(context.getString(oO000Oo0.f56676OooO0O0))) {
                i = p565o0oOo000.o0OOO0o.taurus;
            } else if (strOooO0OO.equals(context.getString(oO000Oo0.f56677OooO0OO))) {
                i = p565o0oOo000.o0OOO0o.gemini;
            } else if (strOooO0OO.equals(context.getString(oO000Oo0.f56678OooO0Oo))) {
                i = p565o0oOo000.o0OOO0o.cancer;
            } else if (strOooO0OO.equals(context.getString(oO000Oo0.f56680OooO0o0))) {
                i = p565o0oOo000.o0OOO0o.leo;
            } else if (strOooO0OO.equals(context.getString(oO000Oo0.f56679OooO0o))) {
                i = p565o0oOo000.o0OOO0o.virgo;
            } else if (strOooO0OO.equals(context.getString(oO000Oo0.f56681OooO0oO))) {
                i = p565o0oOo000.o0OOO0o.libra;
            } else if (strOooO0OO.equals(context.getString(oO000Oo0.f56682OooO0oo))) {
                i = p565o0oOo000.o0OOO0o.scorpio;
            } else if (strOooO0OO.equals(context.getString(oO000Oo0.f56674OooO))) {
                i = p565o0oOo000.o0OOO0o.sagittarius;
            } else if (strOooO0OO.equals(context.getString(oO000Oo0.f56683OooOO0))) {
                i = p565o0oOo000.o0OOO0o.capricorn;
            } else if (strOooO0OO.equals(context.getString(oO000Oo0.f56684OooOO0O))) {
                i = p565o0oOo000.o0OOO0o.aquarius;
            } else {
                i = strOooO0OO.equals(context.getString(oO000Oo0.f56685OooOO0o)) ? p565o0oOo000.o0OOO0o.pisces : p565o0oOo000.o0OOO0o.pisces;
            }
            imageView.setImageResource(i);
            this.ivUserConstellation.setVisibility(0);
        }
        this.tvUserConstellation.setText(strOooO0OO.trim());
        this.tvUserConstellation.setHint("");
    }
}
