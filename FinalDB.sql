USE [SchoolLibrary]
GO
/****** Object:  Table [dbo].[Authors]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Authors](
	[id] [varchar](36) NOT NULL,
	[first_name] [nvarchar](50) NOT NULL,
	[last_name] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Books]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Books](
	[Id] [varchar](36) NOT NULL,
	[Title] [nvarchar](50) NOT NULL,
	[ISBN] [varchar](50) NOT NULL,
	[year_published] [smallint] NOT NULL,
	[status] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[ISBN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Books_Authors]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Books_Authors](
	[Book_Id] [varchar](36) NOT NULL,
	[Author_Id] [varchar](36) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Book_Id] ASC,
	[Author_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Books_Categories]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Books_Categories](
	[Book_Id] [varchar](36) NOT NULL,
	[Category_Id] [varchar](36) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Book_Id] ASC,
	[Category_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Books_Publishers]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Books_Publishers](
	[Book_Id] [varchar](36) NOT NULL,
	[Publisher_Id] [varchar](36) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Book_Id] ASC,
	[Publisher_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[Id] [varchar](36) NOT NULL,
	[Category] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Checkouts]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Checkouts](
	[Id] [varchar](36) NOT NULL,
	[Start_Time] [timestamp] NOT NULL,
	[End_Time] [datetime2](7) NOT NULL,
	[Book_Id] [varchar](36) NOT NULL,
	[Customer_Id] [varchar](36) NOT NULL,
	[Is_Returned] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customers]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customers](
	[Id] [varchar](36) NOT NULL,
	[First_Name] [nvarchar](50) NOT NULL,
	[Last_Name] [nvarchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[Password] [varchar](100) NOT NULL,
	[Is_Admin] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[Email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Holds]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Holds](
	[Id] [varchar](36) NOT NULL,
	[Start_Time] [timestamp] NOT NULL,
	[End_Time] [datetime2](0) NOT NULL,
	[Customer_Id] [varchar](36) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Notifications]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Notifications](
	[Id] [varchar](36) NOT NULL,
	[Sent_At] [timestamp] NOT NULL,
	[Type] [nvarchar](30) NOT NULL,
	[CustomerId] [varchar](36) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Publishers]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Publishers](
	[Id] [varchar](36) NOT NULL,
	[Name] [nvarchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Waitlists]    Script Date: 3/6/2023 2:07:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Waitlists](
	[Book_Id] [varchar](36) NOT NULL,
	[Customer_Id] [varchar](36) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Book_Id] ASC,
	[Customer_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Books_Authors]  WITH CHECK ADD  CONSTRAINT [FK_books_authors_Authors] FOREIGN KEY([Author_Id])
REFERENCES [dbo].[Authors] ([id])
GO
ALTER TABLE [dbo].[Books_Authors] CHECK CONSTRAINT [FK_books_authors_Authors]
GO
ALTER TABLE [dbo].[Books_Authors]  WITH CHECK ADD  CONSTRAINT [FK_books_authors_Books] FOREIGN KEY([Book_Id])
REFERENCES [dbo].[Books] ([Id])
GO
ALTER TABLE [dbo].[Books_Authors] CHECK CONSTRAINT [FK_books_authors_Books]
GO
ALTER TABLE [dbo].[Books_Categories]  WITH CHECK ADD  CONSTRAINT [FK_books_categories_Books] FOREIGN KEY([Book_Id])
REFERENCES [dbo].[Books] ([Id])
GO
ALTER TABLE [dbo].[Books_Categories] CHECK CONSTRAINT [FK_books_categories_Books]
GO
ALTER TABLE [dbo].[Books_Categories]  WITH CHECK ADD  CONSTRAINT [FK_books_categories_Categories] FOREIGN KEY([Category_Id])
REFERENCES [dbo].[Categories] ([Id])
GO
ALTER TABLE [dbo].[Books_Categories] CHECK CONSTRAINT [FK_books_categories_Categories]
GO
ALTER TABLE [dbo].[Books_Publishers]  WITH CHECK ADD  CONSTRAINT [FK_books_publishers_Books] FOREIGN KEY([Book_Id])
REFERENCES [dbo].[Books] ([Id])
GO
ALTER TABLE [dbo].[Books_Publishers] CHECK CONSTRAINT [FK_books_publishers_Books]
GO
ALTER TABLE [dbo].[Books_Publishers]  WITH CHECK ADD  CONSTRAINT [FK_books_publishers_Publishers] FOREIGN KEY([Publisher_Id])
REFERENCES [dbo].[Publishers] ([Id])
GO
ALTER TABLE [dbo].[Books_Publishers] CHECK CONSTRAINT [FK_books_publishers_Publishers]
GO
ALTER TABLE [dbo].[Checkouts]  WITH CHECK ADD  CONSTRAINT [FK_Checkouts_Customers] FOREIGN KEY([Customer_Id])
REFERENCES [dbo].[Customers] ([Id])
GO
ALTER TABLE [dbo].[Checkouts] CHECK CONSTRAINT [FK_Checkouts_Customers]
GO
ALTER TABLE [dbo].[Holds]  WITH CHECK ADD  CONSTRAINT [FK_Holds_Customers] FOREIGN KEY([Customer_Id])
REFERENCES [dbo].[Customers] ([Id])
GO
ALTER TABLE [dbo].[Holds] CHECK CONSTRAINT [FK_Holds_Customers]
GO
ALTER TABLE [dbo].[Notifications]  WITH CHECK ADD  CONSTRAINT [FK_Notifications_Customers] FOREIGN KEY([CustomerId])
REFERENCES [dbo].[Customers] ([Id])
GO
ALTER TABLE [dbo].[Notifications] CHECK CONSTRAINT [FK_Notifications_Customers]
GO
ALTER TABLE [dbo].[Waitlists]  WITH CHECK ADD  CONSTRAINT [FK_Waitlists_Books] FOREIGN KEY([Book_Id])
REFERENCES [dbo].[Books] ([Id])
GO
ALTER TABLE [dbo].[Waitlists] CHECK CONSTRAINT [FK_Waitlists_Books]
GO
ALTER TABLE [dbo].[Waitlists]  WITH CHECK ADD  CONSTRAINT [FK_Waitlists_Customers] FOREIGN KEY([Customer_Id])
REFERENCES [dbo].[Customers] ([Id])
GO
ALTER TABLE [dbo].[Waitlists] CHECK CONSTRAINT [FK_Waitlists_Customers]
GO
