package com.zego.zegoavkit2.mixstream;

/* JADX INFO: loaded from: classes3.dex */
public class ZegoStreamMixer {
    public static final String NON_EXIST_STREAM_ID_KEY = "NonExists";
    public static final String SEQ_KEY = "ReqSeq";

    public boolean mixStream(ZegoCompleteMixStreamInfo zegoCompleteMixStreamInfo, int i) {
        return ZegoMixStreamJNI.mixStream(zegoCompleteMixStreamInfo, i);
    }

    public int mixStreamEx(ZegoMixStreamConfig zegoMixStreamConfig, String str) {
        int i;
        String str2;
        String str3;
        if (str.length() == 0) {
            return -1;
        }
        ZegoMixStreamInfo[] zegoMixStreamInfoArr = zegoMixStreamConfig.inputStreamList;
        int i2 = 0;
        if (zegoMixStreamInfoArr != null && zegoMixStreamInfoArr.length > 0) {
            int i3 = 0;
            while (true) {
                ZegoMixStreamInfo[] zegoMixStreamInfoArr2 = zegoMixStreamConfig.inputStreamList;
                if (i3 >= zegoMixStreamInfoArr2.length) {
                    break;
                }
                ZegoMixStreamInfo zegoMixStreamInfo = zegoMixStreamInfoArr2[i3];
                if (zegoMixStreamInfo == null || (str3 = zegoMixStreamInfo.streamID) == null || str3.length() < 1 || zegoMixStreamInfo.streamID.length() > 512) {
                    return -1;
                }
                i3++;
            }
        }
        ZegoMixStreamOutput[] zegoMixStreamOutputArr = zegoMixStreamConfig.outputList;
        if (zegoMixStreamOutputArr != null && zegoMixStreamOutputArr.length > 0) {
            while (true) {
                ZegoMixStreamOutput[] zegoMixStreamOutputArr2 = zegoMixStreamConfig.outputList;
                if (i2 >= zegoMixStreamOutputArr2.length) {
                    break;
                }
                ZegoMixStreamOutput zegoMixStreamOutput = zegoMixStreamOutputArr2[i2];
                if (zegoMixStreamOutput == null || (str2 = zegoMixStreamOutput.target) == null || str2.length() < 1 || zegoMixStreamOutput.target.length() >= 1024) {
                    return -1;
                }
                i2++;
            }
        }
        if (zegoMixStreamConfig.outputRateControlMode != 1 || ((i = zegoMixStreamConfig.outputQuality) >= 1 && i <= 51)) {
            return ZegoMixStreamJNI.mixStreamEx(zegoMixStreamConfig, str);
        }
        return -1;
    }

    public void setCallback(IZegoMixStreamCallback iZegoMixStreamCallback) {
        ZegoMixStreamJNI.setCallback(iZegoMixStreamCallback);
    }

    public void setMixStreamExCallback(IZegoMixStreamExCallback iZegoMixStreamExCallback) {
        ZegoMixStreamJNI.setMixStreamExCallback(iZegoMixStreamExCallback);
    }

    public void setRelayCDNStateCallback(IZegoMixStreamRelayCDNCallback iZegoMixStreamRelayCDNCallback) {
        ZegoMixStreamJNI.setRelayCDNCallback(iZegoMixStreamRelayCDNCallback);
    }

    public void setSoundLevelInMixStreamCallback(IZegoSoundLevelInMixStreamCallback iZegoSoundLevelInMixStreamCallback) {
        ZegoMixStreamJNI.setSoundLevelInMixStreamCallback(iZegoSoundLevelInMixStreamCallback);
    }
}
