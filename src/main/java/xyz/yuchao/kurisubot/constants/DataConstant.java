package xyz.yuchao.kurisubot.constants;

public interface DataConstant {
    //message_type 消息类型
    //私聊消息
    String message_type_private="private";
    //群消息
    String message_type_group="group";

    //Post_Message_SubType  表示消息子类型
    //friend	好友
    String post_message_subtype_friend="friend";
    //normal	群聊
    String post_message_subtype_normal="normal";
    //anonymous	匿名
    String post_message_subtype_anonymous="anonymous";
    //group_self	群中自身发送
    String post_message_subtype_group_self="group_self";
    //group	群临时会话
    String post_message_subtype_group="group";
    //notice	系统提示
    String post_message_subtype_notice="notice";
}
