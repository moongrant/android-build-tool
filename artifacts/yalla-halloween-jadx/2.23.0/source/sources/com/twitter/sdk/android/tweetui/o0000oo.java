package com.twitter.sdk.android.tweetui;

import android.os.Handler;
import android.text.TextUtils;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.HashtagEntity;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.UrlEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f22452OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.twitter.sdk.android.core.o00O0O<com.twitter.sdk.android.core.o0Oo0oo> f22453OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.twitter.sdk.android.core.o0OOO0o f22451OooO00o = com.twitter.sdk.android.core.o0OOO0o.OooO0OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p188o00o0O.OooOo<Long, com.twitter.sdk.android.core.models.OooOo> f22454OooO0Oo = new p188o00o0O.OooOo<>(20);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p188o00o0O.OooOo<Long, OooOO0O> f22455OooO0o0 = new p188o00o0O.OooOo<>(20);

    public class OooO00o extends com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> f22456OooO00o;

        public OooO00o(OooO oooO) {
            this.f22456OooO00o = oooO;
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(TwitterException twitterException) {
            this.f22456OooO00o.OooO0OO(twitterException);
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(com.twitter.sdk.android.core.o000oOoO<com.twitter.sdk.android.core.models.OooOo> o000oooo2) {
            com.twitter.sdk.android.core.models.OooOo oooOo = o000oooo2.f22205OooO00o;
            o0000oo.this.f22454OooO0Oo.put(Long.valueOf(oooOo.f22064OooO), oooOo);
            com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0 = this.f22456OooO00o;
            if (oooO0O0 != null) {
                oooO0O0.OooO0Oo(new com.twitter.sdk.android.core.o000oOoO<>(oooOo, o000oooo2.f22206OooO0O0));
            }
        }
    }

    public o0000oo(Handler handler, com.twitter.sdk.android.core.OooOOO0 oooOOO0) {
        this.f22452OooO0O0 = handler;
        this.f22453OooO0OO = oooOOO0;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01eb  */
    public final OooOO0O OooO00o(com.twitter.sdk.android.core.models.OooOo oooOo) {
        p188o00o0O.OooOo<Long, OooOO0O> oooOo2;
        p188o00o0O.OooOo<Long, OooOO0O> oooOo3;
        String str;
        int i;
        int iIntValue;
        if (oooOo == null) {
            return null;
        }
        p188o00o0O.OooOo<Long, OooOO0O> oooOo4 = this.f22455OooO0o0;
        OooOO0O oooOO0O = oooOo4.get(Long.valueOf(oooOo.f22064OooO));
        if (oooOO0O != null) {
            return oooOO0O;
        }
        OooOO0O oooOO0O2 = new OooOO0O();
        com.twitter.sdk.android.core.models.Oooo0 oooo0 = oooOo.f22068OooO0Oo;
        ArrayList arrayList = oooOO0O2.f22306OooO0o;
        ArrayList arrayList2 = oooOO0O2.f22307OooO0o0;
        ArrayList arrayList3 = oooOO0O2.f22305OooO0Oo;
        ArrayList arrayList4 = oooOO0O2.f22304OooO0OO;
        ArrayList arrayList5 = oooOO0O2.f22303OooO0O0;
        if (oooo0 != null) {
            List<UrlEntity> list = oooo0.f22110OooO00o;
            if (list != null) {
                for (UrlEntity urlEntity : list) {
                    arrayList5.add(new OooOOO0(urlEntity.f22152OooO0oO, urlEntity.f22151OooO0o0, urlEntity.OooO0O0(), urlEntity.OooO00o(), urlEntity.f22150OooO0o));
                }
            }
            List<MediaEntity> list2 = oooOo.f22068OooO0Oo.f22112OooO0OO;
            if (list2 != null) {
                Iterator<MediaEntity> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new OooOO0(it.next()));
                }
            }
            List<HashtagEntity> list3 = oooOo.f22068OooO0Oo.f22113OooO0Oo;
            if (list3 != null) {
                for (HashtagEntity hashtagEntity : list3) {
                    String str2 = String.format(Locale.US, "https://twitter.com/hashtag/%s?ref_src=twsrc%%5Etwitterkit", hashtagEntity.f22022OooO0o0);
                    arrayList3.add(new OooOOO0("#" + hashtagEntity.f22022OooO0o0, str2, hashtagEntity.OooO0O0(), hashtagEntity.OooO00o(), str2));
                }
            }
            List<MentionEntity> list4 = oooOo.f22068OooO0Oo.f22111OooO0O0;
            if (list4 != null) {
                for (MentionEntity mentionEntity : list4) {
                    String strOooO00o = o0000OO0.OooO00o(mentionEntity.f22043OooO0oo);
                    arrayList2.add(new OooOOO0("@" + mentionEntity.f22043OooO0oo, strOooO00o, mentionEntity.OooO0O0(), mentionEntity.OooO00o(), strOooO00o));
                }
            }
            List<SymbolEntity> list5 = oooOo.f22068OooO0Oo.f22114OooO0o0;
            if (list5 != null) {
                for (SymbolEntity symbolEntity : list5) {
                    String str3 = String.format(Locale.US, "https://twitter.com/search?q=%%24%s&ref_src=twsrc%%5Etwitterkit", symbolEntity.f22149OooO0o0);
                    arrayList.add(new OooOOO0("$" + symbolEntity.f22149OooO0o0, str3, symbolEntity.OooO0O0(), symbolEntity.OooO00o(), str3));
                }
            }
        }
        if (TextUtils.isEmpty(oooOo.f22090OooOoOO)) {
            oooOo2 = oooOo4;
        } else {
            p350o0OOOo00.OooOOO0 oooOOO0 = p350o0OOOo00.OooOOO0.f43692OooO0O0;
            String str4 = oooOo.f22090OooOoOO;
            oooOOO0.getClass();
            int length = str4.length();
            StringBuilder sb = new StringBuilder(length);
            ArrayList arrayList6 = new ArrayList(5);
            int i2 = 0;
            while (i2 < length) {
                char cCharAt = str4.charAt(i2);
                if (cCharAt == '&') {
                    int i3 = i2 + 1;
                    i = length;
                    oooOo3 = oooOo4;
                    int iIndexOf = str4.indexOf(59, i3);
                    if (iIndexOf == -1) {
                        sb.append(cCharAt);
                        str = str4;
                    } else {
                        String strSubstring = str4.substring(i3, iIndexOf);
                        int length2 = strSubstring.length();
                        str = str4;
                        if (length2 <= 0) {
                            iIntValue = -1;
                        } else if (strSubstring.charAt(0) != '#' || length2 <= 1) {
                            Object obj = oooOOO0.f43696OooO00o.f43697OooO00o.get(strSubstring);
                            if (obj == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = ((Integer) obj).intValue();
                            }
                        } else {
                            char cCharAt2 = strSubstring.charAt(1);
                            if (cCharAt2 != 'x' && cCharAt2 != 'X') {
                                try {
                                    iIntValue = Integer.parseInt(strSubstring.substring(1));
                                } catch (Exception unused) {
                                    iIntValue = -1;
                                }
                            } else if (length2 > 2) {
                                iIntValue = Integer.valueOf(strSubstring.substring(2), 16).intValue();
                            } else {
                                iIntValue = -1;
                            }
                        }
                        if (iIntValue == -1) {
                            sb.append(Typography.amp);
                            if (strSubstring.indexOf(38) == -1) {
                                sb.append(strSubstring);
                                sb.append(';');
                            }
                        } else {
                            sb.append((char) iIntValue);
                            arrayList6.add(new int[]{i2, iIndexOf});
                        }
                        i2 = iIndexOf;
                    }
                } else {
                    oooOo3 = oooOo4;
                    str = str4;
                    i = length;
                    sb.append(cCharAt);
                }
                i2++;
                str4 = str;
                length = i;
                oooOo4 = oooOo3;
            }
            oooOo2 = oooOo4;
            StringBuilder sb2 = new StringBuilder(sb.toString());
            o000OO.OooO0O0(arrayList5, arrayList6);
            o000OO.OooO0O0(arrayList4, arrayList6);
            o000OO.OooO0O0(arrayList3, arrayList6);
            o000OO.OooO0O0(arrayList2, arrayList6);
            o000OO.OooO0O0(arrayList, arrayList6);
            ArrayList arrayList7 = new ArrayList();
            int length3 = sb2.length() - 1;
            for (int i4 = 0; i4 < length3; i4++) {
                if (Character.isHighSurrogate(sb2.charAt(i4)) && Character.isLowSurrogate(sb2.charAt(i4 + 1))) {
                    arrayList7.add(Integer.valueOf(i4));
                }
            }
            o000OO.OooO00o(arrayList5, arrayList7);
            o000OO.OooO00o(arrayList4, arrayList7);
            o000OO.OooO00o(arrayList3, arrayList7);
            o000OO.OooO00o(arrayList2, arrayList7);
            o000OO.OooO00o(arrayList, arrayList7);
            oooOO0O2.f22302OooO00o = sb2.toString();
        }
        if (!TextUtils.isEmpty(oooOO0O2.f22302OooO00o)) {
            oooOo2.put(Long.valueOf(oooOo.f22064OooO), oooOO0O2);
        }
        return oooOO0O2;
    }

    public final void OooO0O0(Oooo0 oooo0) {
        com.twitter.sdk.android.core.o0Oo0oo o0oo0oo2 = (com.twitter.sdk.android.core.o0Oo0oo) ((com.twitter.sdk.android.core.OooOOO0) this.f22453OooO0OO).OooO0OO();
        if (o0oo0oo2 == null) {
            oooo0.OooO0OO(new TwitterAuthException("User authorization required"));
        } else {
            oooo0.OooO0Oo(new com.twitter.sdk.android.core.o000oOoO(o0oo0oo2, null));
        }
    }
}
