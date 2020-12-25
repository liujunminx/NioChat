package cn.sinjinsong.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 消息实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private MessageHeader header;
    private byte[] body;
}
