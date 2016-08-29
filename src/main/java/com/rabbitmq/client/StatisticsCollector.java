package com.rabbitmq.client;

/**
 *
 */
public interface StatisticsCollector extends Statistics {

    void newConnection(Connection connection);

    void closeConnection(Connection connection);

    void newChannel(Channel channel);

    void closeChannel(Channel channel);

    void basicPublish(Channel channel);

    void consumedMessage(Channel channel, long deliveryTag, boolean autoAck);

    void consumedMessage(Channel channel, long deliveryTag, String consumerTag);

    void command(Connection connection, Channel channel, Command command);

    void basicAck(Channel channel, long deliveryTag, boolean multiple);

    void basicConsume(Channel channel, String consumerTag, boolean autoAck);
}
